SUMMARY = "Minimal Getty for Virtual Consoles Only"
DESCRIPTION = "The mingetty program is a lightweight, minimalistic getty program for \
use on virtual consoles only. Mingetty is not suitable for serial lines \
(you should use the mgetty program for this purpose)."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.8s"

RPM_NAME = "mingetty-1.0.8s-24.2.aarch64.rpm"
RPM_HASH = "168e3c33c2fee52efdf5de86575154b0e779b9220469df6a118a6d9c94b3031a2caf4969b9fb1565a8e4d77007dc6ddcdd6fcca4226407a784c511c607c10dbd"

RPROVIDES:${PN} += "mingetty \
mingetty(aarch-64) \
sysvinit:/sbin/mingetty"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
