SUMMARY = "Blosc data compressor for Python"
DESCRIPTION = "Blosc is a high performance compressor optimized for binary data in \
Python."
LICENSE = "MIT"

PV = "1.11.1"

RPM_NAME = "python39-blosc-1.11.1-1.4.aarch64.rpm"
RPM_HASH = "5d25ff3b6a8402b13e55cca1d4527e25fa0ed6ea861ebb523d46c44b315532fbb420a144d15a8f54120e5b866fb55f295485402dd9e33383492e8201b07a2091"

RPROVIDES:${PN} += "python3.9dist(blosc) \
python39-blosc \
python39-blosc(aarch-64) \
python3dist(blosc)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libblosc.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
