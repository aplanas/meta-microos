SUMMARY = "LSC Algorithm Inspiral Library"
DESCRIPTION = "The LSC Algorithm Inspiral Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "python310-lalinspiral-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "3f8dd08b6ec715e27c805c54032ae3f6b68862bd47dd21bb995659bf5887f91a3451eed2bfce99cd36feef8a223681f80922975f824539515de68312be22b4dc"

RPROVIDES:${PN} += "python3-lalinspiral \
python310-lalinspiral"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalinspiral.so.17 \
liblalsupport.so.14 \
libm.so.6 \
python-abi \
python310-glue \
python310-lal \
python310-lalburst \
python310-lalframe \
python310-lalmetaio \
python310-lalsimulation \
python310-numpy"

inherit rpm
