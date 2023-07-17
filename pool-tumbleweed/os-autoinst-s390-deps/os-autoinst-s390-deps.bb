SUMMARY = "Convenience package providing os-autoinst + s390 worker jumphost deps"
DESCRIPTION = "Convenience package providing os-autoinst + s390 worker jumphost dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1688832263.576c710"

RPM_NAME = "os-autoinst-s390-deps-4.6.1688832263.576c710-1.1.aarch64.rpm"
RPM_HASH = "237c1b088fbd730e1241627be8620550e56cec395bc99221471195c6900e836dc02637e50ff4453a2a73a97676c93499f270bc52bea87c524ece6bcf8db7697c"

RPROVIDES:${PN} += "os-autoinst-s390-deps"

RDEPENDS:${PN} += "/usr/bin/Xvnc \
/usr/bin/xkbcomp \
fonts-config \
icewm \
mkfontdir \
mkfontscale \
os-autoinst \
x3270 \
xdotool \
xterm \
xterm-console"

inherit rpm
