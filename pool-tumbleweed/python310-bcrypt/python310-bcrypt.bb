SUMMARY = "BSD type 2a and 2b password hashing"
DESCRIPTION = "This Python module supports creating (and verifying) password hashes \
using the BSD-originating hashing methods known as '2a' and '2b'."
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "python310-bcrypt-4.0.1-2.3.aarch64.rpm"
RPM_HASH = "627bdfe1db8b6936955c1d4be7d341734082e2b27e0c80d364e636d5e05a5ffeeac698b62c757380d30eb7b5c0a0a3a02d7fee0ca8c3fab5fd45444bca4638c7"

RPROVIDES:${PN} += "python3.10dist-bcrypt \
python310-bcrypt \
python310-py-bcrypt \
python3dist-bcrypt"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
