SUMMARY = "Runtime C++ ANTRL libraries"
DESCRIPTION = "ANTLR runtime libraries for C++. \
ANTLR (ANother Tool for Language Recognition) is a parser generator \
for reading, processing, executing, or translating structured text or \
binary files."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "libantlr4-runtime4_13_0-4.13.0-1.2.aarch64.rpm"
RPM_HASH = "c7033b5ab8b4261ee3ed01ba5de8921888f1ae08bf11b64e618f3e29220a97d6f2a6a1a65bf39a6a696967a491d2eae3ae67fc108171958ed4d19effd8f351c8"

RPROVIDES:${PN} += "libantlr4-runtime.so.4.13.0 \
libantlr4-runtime4-13-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
