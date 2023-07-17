SUMMARY = "Continuously update packages from devel:openQA"
DESCRIPTION = "Use this package to install and enable a systemd service for continuously \
upgrading the system if devel:openQA packages are stable and contain updates. It \
is complementary to auto-update which also reboots the system and does updates \
regardless of whether devel:openQA contains updates."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1689162874.c51d4b9"

RPM_NAME = "openQA-continuous-update-4.6.1689162874.c51d4b9-1.1.aarch64.rpm"
RPM_HASH = "3df311b4170f96086b1b05d0ebc0b01ae14228f14e0d6bd838011ecc03578b58248b7eefc5ffd5bbe04e0e5b8fdec88f5121dfff59de48ac93bd6b76c789d55c"

RPROVIDES:${PN} += "openQA-continuous-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common"

inherit rpm
