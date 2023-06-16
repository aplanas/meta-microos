SUMMARY = "Automatically upgrade and reboot the system when required"
DESCRIPTION = "Use this package to install and enable a systemd service for nightly upgrading \
and rebooting the system if devel:openQA packages are stable."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1685738164.28716cd"

RPM_NAME = "openQA-auto-update-4.6.1685738164.28716cd-1.1.aarch64.rpm"
RPM_HASH = "5d1abdb0555ce2a7bb4c000fc99a87d940400a6abea758a2e5d2f0158fc9b336033100425c152c933c2569c568c20b339fb0895ecdd8368d7b16f1235c5fd786"

RPROVIDES:${PN} += "openQA-auto-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common \
rebootmgr"

inherit rpm
