SUMMARY = "LSC Algorithm Frame Library for gravitational wave data analysis"
DESCRIPTION = "The LSC Algorithm Frame Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python39-lalframe-2.0.1-1.2.aarch64.rpm"
RPM_HASH = "2d7ab4717874e09ce04dbe26f1cdb7cbf5482a15a1d285e5ef686424adf8b4483904ed9949390fdadbf78a834c79086e8ad94b3577f23cb392f2970022e97447"

RPROVIDES:${PN} += "python39-lalframe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalframe.so.13 \
liblalsupport.so.14 \
python-abi \
python39-lal \
python39-numpy"

inherit rpm
