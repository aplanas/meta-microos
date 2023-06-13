SUMMARY = "LSC Algorithm Burst Library"
DESCRIPTION = "The LSC Algorithm Burst Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "python38-lalburst-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "a145127dcc98f924b5cb0120d98c1d53d3bc510ddb9abdc877c4d657b574e44b23bdfad18ab397211a1ebb7c71ec56b8176831581b5f2576cb29dc0b2f0ef07d"

RPROVIDES:${PN} += "python38-lalburst \
python38-lalburst(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgsl.so.25()(64bit) \
liblal.so.20()(64bit) \
liblalburst.so.6()(64bit) \
liblalsupport.so.14()(64bit) \
libm.so.6()(64bit) \
python(abi) \
python38-glue \
python38-lal \
python38-lalmetaio \
python38-lalsimulation \
python38-ligo-lw \
python38-numpy \
python38-scipy"

inherit rpm
