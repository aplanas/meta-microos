SUMMARY = "Python library for the snappy compression library"
DESCRIPTION = "Python library for the snappy compression library from Google."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python310-python-snappy-0.6.1-1.5.aarch64.rpm"
RPM_HASH = "4729c001adc146aad69aa26e0b2776551968dfd7443309396154bc2a3bc37a2b34411daba6d289d4e15c85b0f64690abcc2b962391c2b086b09a7cf0655f23fd"

RPROVIDES:${PN} += "python3.10dist-python-snappy \
python310-python-snappy \
python3dist-python-snappy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsnappy.so.1 \
python-abi"

inherit rpm
