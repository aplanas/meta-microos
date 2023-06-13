SUMMARY = "BSD type 2a and 2b password hashing"
DESCRIPTION = "This Python module supports creating (and verifying) password hashes \
using the BSD-originating hashing methods known as '2a' and '2b'."
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "python39-bcrypt-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "d38a2b959a0d9575357a31eec56407f528fcebdaa1d0284a5207741dac4e87cbea330fee7abac8190363436545358e733a8add8867be17c8c6aab21e7363e4ea"

RPROVIDES:${PN} += "python3.9dist(bcrypt) \
python39-bcrypt \
python39-bcrypt(aarch-64) \
python39-py-bcrypt \
python3dist(bcrypt)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
python(abi)"

inherit rpm
