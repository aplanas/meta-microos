SUMMARY = "Scientific-grade astronomy routines for Python"
DESCRIPTION = "PyEphem provides an ephem Python package for performing high-precision astronomy computations."
LICENSE = "MIT"

PV = "4.1.4"

RPM_NAME = "python39-ephem-4.1.4-1.5.aarch64.rpm"
RPM_HASH = "fa540ae402a964b787b416cc07525b8589b5a4843c88985f6098247e7f42350669df544c3677d0395d6cd3f9e5f2fd5d292685477962797c0c3ffa9277a455dd"

RPROVIDES:${PN} += "python3.9dist(ephem) \
python39-ephem \
python39-ephem(aarch-64) \
python3dist(ephem)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
python(abi) \
python39-pytzdata"

inherit rpm
