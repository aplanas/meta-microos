SUMMARY = "Nostalgia keyboard sound emulator"
DESCRIPTION = "This project emulates the sound of an old faithful IBM Model-M space \
saver bucklespring keyboard while typing on a notebook/pc."
LICENSE = "GPL-2.0-only"

PV = "1.5.1"

RPM_NAME = "bucklespring-1.5.1-1.7.aarch64.rpm"
RPM_HASH = "bb3208173c0759d34c97c08ee9e37a81324ea3d6a1fb4c1f17642d1ecf275b1430346ce239505e1feecb49745f0ec01243ef3c08916c45bf8bf6297ab4c21e7d"

RPROVIDES:${PN} += "application() \
application(buckle.desktop) \
bucklespring \
bucklespring(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libalure.so.1()(64bit) \
libc.so.6()(64bit) \
libopenal.so.1()(64bit)"

inherit rpm
