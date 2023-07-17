SUMMARY = "Automatically upgrade and reboot the system when required"
DESCRIPTION = "Use this package to install and enable a systemd service for nightly upgrading \
and rebooting the system if devel:openQA packages are stable."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689162874.c51d4b9"

RPM_NAME = "openQA-auto-update-4.6.1689162874.c51d4b9-1.1.aarch64.rpm"
RPM_HASH = "3575421e2b1fb06b36a1488469eee448c53d8eb443e922b946ae01c7256cf5ba3dcb43b0d43455cf064d5071dd36bb2bd695343090a31603c3f2d3ff56020a07"

RPROVIDES:${PN} += "openQA-auto-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common \
rebootmgr"

inherit rpm
