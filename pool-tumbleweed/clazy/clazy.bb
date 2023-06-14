SUMMARY = "Qt oriented code checker based on the Clang framework"
DESCRIPTION = "clazy is a compiler plugin which allows Clang to understand Qt semantics. \
You get more than 50 Qt related compiler warnings, ranging from unneeded memory \
allocations to misusage of API, including fix-its for automatic refactoring."
LICENSE = "LGPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "clazy-1.11-3.5.aarch64.rpm"
RPM_HASH = "e0747c7d746508b89f8d6b8809ff17a73853ea3e47af0d86329e2497e2253c6978faa222d8db14342754271ef2dd23c3b2280c612cda86d5a36503c2d876f6c7"

RPROVIDES:${PN} += "clazy"

RDEPENDS:${PN} += "/bin/sh \
clang16 \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libclang-cpp.so.16 \
libstdc++.so.6"

inherit rpm
