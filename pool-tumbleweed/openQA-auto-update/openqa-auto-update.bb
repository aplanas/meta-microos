SUMMARY = "Automatically upgrade and reboot the system when required"
DESCRIPTION = "Use this package to install and enable a systemd service for nightly upgrading \
and rebooting the system if devel:openQA packages are stable."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690803816.e47aebd"

RPM_NAME = "openQA-auto-update-4.6.1690803816.e47aebd-1.1.aarch64.rpm"
RPM_HASH = "5bea3f529c492b266a4d57de68e92895034a8908b61ef7d67df0e22f45cb4a048d1795a23e4507c718e08fb921e581e01408397e0c7324722c891cf14e59eda5"

RPROVIDES:${PN} += "openQA-auto-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common \
rebootmgr"

inherit rpm
