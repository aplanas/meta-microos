SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20230707"

RPM_NAME = "python39-libfmos-20230707-1.1.aarch64.rpm"
RPM_HASH = "1cb294167cd3f2be687e5d3228d32b43eefe89a59025e10e42a89b4e99e208bed487102b973bb55b826b2119efcbe1fba21f7154f7cd4a776250261cb775ce04"

RPROVIDES:${PN} += "python39-libfmos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfmos.so.1 \
python-abi"

inherit rpm
