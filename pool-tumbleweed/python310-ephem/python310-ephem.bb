SUMMARY = "Scientific-grade astronomy routines for Python"
DESCRIPTION = "PyEphem provides an ephem Python package for performing high-precision astronomy computations."
LICENSE = "MIT"

PV = "4.1.4"

RPM_NAME = "python310-ephem-4.1.4-1.7.aarch64.rpm"
RPM_HASH = "d1813f71d0bda5f14e3b78f9f1cf1bcd2934d9d30a44f8afc6e9c22b8ed1c05802f33e4de0a86c4c222c2b6280494cce299c1d9df73d517ab7df1bfe8209d6f4"

RPROVIDES:${PN} += "python3.10dist-ephem \
python310-ephem \
python3dist-ephem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi \
python310-pytzdata"

inherit rpm
