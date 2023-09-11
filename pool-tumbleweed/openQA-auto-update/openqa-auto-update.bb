SUMMARY = "Automatically upgrade and reboot the system when required"
DESCRIPTION = "Use this package to install and enable a systemd service for nightly upgrading \
and rebooting the system if devel:openQA packages are stable."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1693565748.f367431"

RPM_NAME = "openQA-auto-update-4.6.1693565748.f367431-1.1.aarch64.rpm"
RPM_HASH = "957c61177c8c9cc79f35ba0a015b44c5e98b2b13c1b3a46e80d39e963b1ff4886e5256ca0af3beeeb21cac7910b27e3fa50fc2dbcb18b2be644d8671b8f65d36"

RPROVIDES:${PN} += "openQA-auto-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common \
rebootmgr"

inherit rpm
