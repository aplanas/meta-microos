SUMMARY = "BSD type 2a and 2b password hashing"
DESCRIPTION = "This Python module supports creating (and verifying) password hashes \
using the BSD-originating hashing methods known as '2a' and '2b'."
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "python311-bcrypt-4.0.1-2.3.aarch64.rpm"
RPM_HASH = "e71f54f72b326d10386d4f8241a5b19b2d0db8777d16d9e7bc68878be27a21b8db164909e344bb96c5283ac5fa6ff5617f5a253b112488ea4a0b2e05d4f01e7c"

RPROVIDES:${PN} += "python3-bcrypt \
python3-py-bcrypt \
python3.11dist-bcrypt \
python311-bcrypt \
python311-py-bcrypt \
python3dist-bcrypt"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
