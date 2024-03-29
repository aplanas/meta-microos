SUMMARY = "LSC Algorithm Inference Library"
DESCRIPTION = "The LSC Algorithm Inference Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.0"

RPM_NAME = "python310-lalinference-4.0.0-1.2.aarch64.rpm"
RPM_HASH = "4dfc771ba46818bf3842a3ecda6a60b48206bc02a3456ed9cf658fca5b0fe5fc346af4bee9c65bc9cca41e0d07a033627a17bf6f5610f2b967e5bd27052cbc9d"

RPROVIDES:${PN} += "python3-lalinference \
python310-lalinference"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalinference.so.23 \
liblalsupport.so.14 \
python-abi \
python310-lal \
python310-lalburst \
python310-lalframe \
python310-lalinference-data \
python310-lalinspiral \
python310-lalmetaio \
python310-lalsimulation"

inherit rpm
