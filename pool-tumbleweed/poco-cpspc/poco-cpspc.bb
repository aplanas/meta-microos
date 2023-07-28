SUMMARY = "POCO C++ Server Page Compiler"
DESCRIPTION = "This program compiles web pages containing embedded C++ code into a C++ class \
that can be used with the HTTP server from the POCO Net library."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "poco-cpspc-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "81c9d1b8d68e7c15d4e4c71e51e6091fe5ead3e14d53a1af4e7e733dc67881a6d7ba430aa319a3cbcbb2b6db241b65aaf608949075e8e4035d7150a2ae8ce8c8"

RPROVIDES:${PN} += "poco-cpspc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libPocoNet.so.94 \
libPocoUtil.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
