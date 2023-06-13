SUMMARY = "Scientific-grade astronomy routines for Python"
DESCRIPTION = "PyEphem provides an ephem Python package for performing high-precision astronomy computations."
LICENSE = "MIT"

PV = "4.1.4"

RPM_NAME = "python311-ephem-4.1.4-1.5.aarch64.rpm"
RPM_HASH = "7981b495bf5dc96d064e0960d773f85868548eee65d4ecdac9473bc63fbb1e318f9f31b427fda545ae1ab0674febe0042cc7c38a6624dc2af7aab63f2e647135"

RPROVIDES:${PN} += "python3.11dist(ephem) \
python311-ephem \
python311-ephem(aarch-64) \
python3dist(ephem)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
python(abi) \
python311-pytzdata"

inherit rpm
