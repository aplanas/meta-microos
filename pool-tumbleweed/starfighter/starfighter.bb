SUMMARY = "Liberate the universe from the evil company WEAPCO"
DESCRIPTION = "Project: Starfighter is an old school 2D shoot 'em up. In the game you take on \
the role of a rebel pilot called Chris, who is attempting to overthrow a \
military corporation called Weapco. Weapco has seized control of the known \
universe and currently rules it with an iron fist. Chris can no longer stand \
back and watch as millions of people suffer and die. He steals an experimental \
craft known as 'Firefly' and begins his mission to fight his way to Sol, \
freeing key systems along the way. The game opens with Chris attempting to \
escape a Weapco patrol that has intercepted him."
LICENSE = "GPL-3.0-or-later"

PV = "2.4"

RPM_NAME = "starfighter-2.4-1.13.aarch64.rpm"
RPM_HASH = "77d121ee432e204be4e7d3f90727fb6341ad3bc1faff573f21392fb6417805ca671247c08d156f9ab00e63a6de5d310464a414dc75dafaa0d9cc791bb7853ad4"

RPROVIDES:${PN} += "application() \
application(starfighter.desktop) \
metainfo() \
metainfo(starfighter.appdata.xml) \
starfighter \
starfighter(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libSDL2_ttf-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
