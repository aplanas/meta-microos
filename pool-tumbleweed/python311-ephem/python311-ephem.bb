SUMMARY = "Scientific-grade astronomy routines for Python"
DESCRIPTION = "PyEphem provides an ephem Python package for performing high-precision astronomy computations."
LICENSE = "MIT"

PV = "4.1.4"

RPM_NAME = "python311-ephem-4.1.4-1.7.aarch64.rpm"
RPM_HASH = "cc3bdfe6e07467b44cd06ffaddf3b006f48f8d654b765053373bdf55f8141ce7373da8b333bc8cb8b066a70baec712d2ad95c385faca3a5a6cda9b622899ab2b"

RPROVIDES:${PN} += "python3-ephem \
python3.11dist-ephem \
python311-ephem \
python3dist-ephem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python311-pytzdata"

inherit rpm
