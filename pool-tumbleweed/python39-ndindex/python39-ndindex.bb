SUMMARY = "A Python library for manipulating indices of ndarrays"
DESCRIPTION = "A Python library for manipulating indices of ndarrays."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python39-ndindex-1.6-1.3.aarch64.rpm"
RPM_HASH = "5db586b3194833fe8de1567c052d8121b9ec1611c88f35584b5c66988a3102261b14d091fdcbc35d1a68ef035a3463a68700320116f4896ac1dcd6ce4bf23887"

RPROVIDES:${PN} += "python3.9dist-ndindex \
python39-ndindex \
python3dist-ndindex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
