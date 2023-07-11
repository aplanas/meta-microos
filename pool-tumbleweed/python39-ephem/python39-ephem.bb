SUMMARY = "Scientific-grade astronomy routines for Python"
DESCRIPTION = "PyEphem provides an ephem Python package for performing high-precision astronomy computations."
LICENSE = "MIT"

PV = "4.1.4"

RPM_NAME = "python39-ephem-4.1.4-1.7.aarch64.rpm"
RPM_HASH = "4f4b6b2efb4a938fece6f03103aabf9ed1352b65d5230ab9ee4d091edde57b3390c66e9da0633c5d0a21f86070cd9f935b166b05655e6f063ddb8776fc8152dd"

RPROVIDES:${PN} += "python3.9dist-ephem \
python39-ephem \
python3dist-ephem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python39-pytzdata"

inherit rpm
