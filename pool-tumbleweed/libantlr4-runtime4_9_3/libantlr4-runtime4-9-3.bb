SUMMARY = "Runtime C++ ANTRL libraries"
DESCRIPTION = "ANTLR runtime libraries for C++. \
ANTLR (ANother Tool for Language Recognition) is a parser generator \
for reading, processing, executing, or translating structured text or \
binary files."
LICENSE = "BSD-3-Clause"

PV = "4.9.3"

RPM_NAME = "libantlr4-runtime4_9_3-4.9.3-1.10.aarch64.rpm"
RPM_HASH = "9de45dbe6bad64b509f8fcb6114fbce4b406a48e434152f91875d1f752069e9aec564a4af46fb1c5afa9858b4801cb6c495a7b321cccf0c42a92edc1cd0e143e"

RPROVIDES:${PN} += "libantlr4-runtime.so.4.9.3 \
libantlr4-runtime4-9-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
