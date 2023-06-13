SUMMARY = "LSC Algorithm Inspiral Library"
DESCRIPTION = "The LSC Algorithm Inspiral Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "python38-lalinspiral-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "0d41410f380331c90fc99b89842bf56cd49eeceae60c4ff31c08fe43786737fddfa2d5429795c9db6b304d8d749817b4730eb0d06db9962c19479c0081f128fa"

RPROVIDES:${PN} += "python38-lalinspiral \
python38-lalinspiral(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblal.so.20()(64bit) \
liblalinspiral.so.17()(64bit) \
liblalsupport.so.14()(64bit) \
libm.so.6()(64bit) \
python(abi) \
python38-glue \
python38-lal \
python38-lalburst \
python38-lalframe \
python38-lalmetaio \
python38-lalsimulation \
python38-numpy"

inherit rpm
