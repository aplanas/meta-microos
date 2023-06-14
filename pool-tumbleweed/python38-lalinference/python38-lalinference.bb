SUMMARY = "LSC Algorithm Inference Library"
DESCRIPTION = "The LSC Algorithm Inference Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "python38-lalinference-4.0.0-1.2.aarch64.rpm"
RPM_HASH = "ae0ef805c760875e1809d81b219db3055f8cc927098a43f649807c875f797662ef672b883b1a2c250e6438f4d9021cadedf0cb16f794c19d9bd77fc33853882a"

RPROVIDES:${PN} += "python38-lalinference"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalinference.so.23 \
liblalsupport.so.14 \
python-abi \
python38-lal \
python38-lalburst \
python38-lalframe \
python38-lalinference-data \
python38-lalinspiral \
python38-lalmetaio \
python38-lalsimulation"

inherit rpm
