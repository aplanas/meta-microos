SUMMARY = "Scientific-grade astronomy routines for Python"
DESCRIPTION = "PyEphem provides an ephem Python package for performing high-precision astronomy computations."
LICENSE = "MIT"

PV = "4.1.4"

RPM_NAME = "python310-ephem-4.1.4-1.5.aarch64.rpm"
RPM_HASH = "ad5f5b89909d30244d88cf2c97cb40d188fd51a464ae4ee459eb4b24d1fc448c6a68257563124e64126be958636abced6cce7fb8bd35fb5f6777ed8950e051ba"

RPROVIDES:${PN} += "python3-ephem \
python3.10dist(ephem) \
python310-ephem \
python310-ephem(aarch-64) \
python3dist(ephem)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
python(abi) \
python310-pytzdata"

inherit rpm
