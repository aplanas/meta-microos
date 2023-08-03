SUMMARY = "Convenience package providing os-autoinst + s390 worker jumphost deps"
DESCRIPTION = "Convenience package providing os-autoinst + s390 worker jumphost dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1690540437.6c17e24"

RPM_NAME = "os-autoinst-s390-deps-4.6.1690540437.6c17e24-1.1.aarch64.rpm"
RPM_HASH = "6425e42d043c8ee007653e920362d4100145c1027d2043dd60981803c8533a55d4b6b25d0aebbfec09d03a0713bad3ddf99859c7b10a7f08769545cb66611c38"

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
