SUMMARY = "Library implementing a mutable variant of namedtuple"
DESCRIPTION = "Mutable variant of namedtuple -- recordclass, which support assignments, and \
other memory saving variants."
LICENSE = "MIT"

PV = "0.18.0.1"

RPM_NAME = "python39-recordclass-0.18.0.1-1.7.aarch64.rpm"
RPM_HASH = "c46e61c6f6a772f6d615359336c1a0b8d532f6e6c594585406f92e1ba18ce8b19688eaa5196153e022ec14f3fffe376f66e54f98662920661f4f73a8deca5bc0"

RPROVIDES:${PN} += "python3.9dist-recordclass \
python39-recordclass \
python3dist-recordclass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
