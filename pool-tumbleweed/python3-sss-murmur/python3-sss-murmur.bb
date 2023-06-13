SUMMARY = "Python3 bindings for SSSD Murmur hash function"
DESCRIPTION = "This subpackage provides the python3 module for calculating the \
Murmur hash version 3."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python3-sss-murmur-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "f0ee4424267b3ffe0b3ce61d61a48681d81fe55f0fc79f15009b256c24bb9665a4fb031b494d4f1933334ceb7086cb3634ae9b8ab34b2f17864f9603d4b66434"

RPROVIDES:${PN} += "python3-sss-murmur \
python3-sss-murmur(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python3"

inherit rpm
