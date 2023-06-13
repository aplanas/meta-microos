SUMMARY = "RFC 7049 - Concise Binary Object Representation"
DESCRIPTION = "RFC 7049 - Concise Binary Object Representation"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python310-cbor-1.0.0-1.23.aarch64.rpm"
RPM_HASH = "ee95f0333c0eadeb0bb9ae6050b412e80d47c33e2f9cf826f6f9ec38a8e4b05b6ba0d0b6e110ce364bf888a02878cc4d11d723762035b8eeeef91bf027c4c3de"

RPROVIDES:${PN} += "python3-cbor \
python3.10dist(cbor) \
python310-cbor \
python310-cbor(aarch-64) \
python3dist(cbor)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-base"

inherit rpm
