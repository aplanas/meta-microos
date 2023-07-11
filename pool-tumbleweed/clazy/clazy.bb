SUMMARY = "Qt oriented code checker based on the Clang framework"
DESCRIPTION = "clazy is a compiler plugin which allows Clang to understand Qt semantics. \
You get more than 50 Qt related compiler warnings, ranging from unneeded memory \
allocations to misusage of API, including fix-its for automatic refactoring."
LICENSE = "LGPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "clazy-1.11-3.7.aarch64.rpm"
RPM_HASH = "ae89887f2f22dccc71204cc6a64a4fa2bc56a04c2e851d28af6e0462dda9af2a9ee4b73815da7e071a4195283cb182e40b1b37db6d404079cb06c2a95d90ee39"

RPROVIDES:${PN} += "clazy"

RDEPENDS:${PN} += "/usr/bin/sh \
clang16 \
ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libclang-cpp.so.16 \
libstdc++.so.6"

inherit rpm
