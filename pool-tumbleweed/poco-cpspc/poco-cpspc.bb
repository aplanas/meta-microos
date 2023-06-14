SUMMARY = "POCO C++ Server Page Compiler"
DESCRIPTION = "This program compiles web pages containing embedded C++ code into a C++ class \
that can be used with the HTTP server from the POCO Net library."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "poco-cpspc-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "660b6063eae6341461d8792c8fd5edf53f9a7deeb2541202ea4a91ed5f491be25eea0add709778410088947f89dfb882f3a4b4cc8b3b2dc46a2680839172725c"

RPROVIDES:${PN} += "poco-cpspc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libPocoNet.so.92 \
libPocoUtil.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
