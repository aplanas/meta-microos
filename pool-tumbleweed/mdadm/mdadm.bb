SUMMARY = "Utility for configuring 'MD' software RAID devices"
DESCRIPTION = "mdadm is a program that can be used to control Linux md devices."
LICENSE = "GPL-2.0-only"

PV = "4.2"

RPM_NAME = "mdadm-4.2-9.1.aarch64.rpm"
RPM_HASH = "8d8884df729be80a299efa9569917f7308e46f5d6e12bf5a8238d8ca4a50fc8b7e84270e7ef95dc1aab2d87bd50c57eb9d220b065b317bc59b4847213dc38b8a"

RPROVIDES:${PN} += "mdadm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm
