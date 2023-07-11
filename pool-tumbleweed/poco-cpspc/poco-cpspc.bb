SUMMARY = "POCO C++ Server Page Compiler"
DESCRIPTION = "This program compiles web pages containing embedded C++ code into a C++ class \
that can be used with the HTTP server from the POCO Net library."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "poco-cpspc-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "24208d07aed0b3ff36dc9a961d390931f18e508f3123eb9b46f75106855296751b72903b2a60b9da9a09e91948867208b849944690d283d4a02a4f3f1bac3c03"

RPROVIDES:${PN} += "poco-cpspc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libPocoNet.so.92 \
libPocoUtil.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
