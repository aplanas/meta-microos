SUMMARY = "BSD type 2a and 2b password hashing"
DESCRIPTION = "This Python module supports creating (and verifying) password hashes \
using the BSD-originating hashing methods known as '2a' and '2b'."
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "python310-bcrypt-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "cff615222b9efb51314932b13c7d04196da2e60ab266621ec696c3cb7b43d0765e076995095f0b94e4ca01cb8dffc3bde6850a845e2c0e0f91de2c8c8d7b9970"

RPROVIDES:${PN} += "python3-bcrypt \
python3-py-bcrypt \
python3.10dist(bcrypt) \
python310-bcrypt \
python310-bcrypt(aarch-64) \
python310-py-bcrypt \
python3dist(bcrypt)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
python(abi)"

inherit rpm
