SUMMARY = "Automatically upgrade and reboot the system when required"
DESCRIPTION = "Use this package to install and enable a systemd service for nightly upgrading \
and rebooting the system if devel:openQA packages are stable."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1692951551.c933949"

RPM_NAME = "openQA-auto-update-4.6.1692951551.c933949-1.1.aarch64.rpm"
RPM_HASH = "6d3c0277ef243ce68d12dd359f9910c4f1d450f8921fb0772d80541739a4d14cbbc87fcf4c72ac066489c3a42e78a2c9cfdb629685f08ee1f14e076a899ec4b6"

RPROVIDES:${PN} += "openQA-auto-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common \
rebootmgr"

inherit rpm
