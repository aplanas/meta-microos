SUMMARY = "BSD type 2a and 2b password hashing"
DESCRIPTION = "This Python module supports creating (and verifying) password hashes \
using the BSD-originating hashing methods known as '2a' and '2b'."
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "python39-bcrypt-4.0.1-2.3.aarch64.rpm"
RPM_HASH = "a92ec727264609a6f4942816b1db09b22f0fcf34e333646a22cc394928e26dbd367e78e4b4bc6d1a1600bd68506c79af881a822db5649b74a1cb72ffb9a72394"

RPROVIDES:${PN} += "python3.9dist-bcrypt \
python39-bcrypt \
python39-py-bcrypt \
python3dist-bcrypt"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
