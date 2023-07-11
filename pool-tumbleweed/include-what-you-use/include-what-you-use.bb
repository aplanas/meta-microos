SUMMARY = "A tool to analyze #includes in C and C++ source files"
DESCRIPTION = "'Include what you use' means this: for every symbol (type, function, \
variable, or macro) that you use in foo.cc (or foo.cpp), either foo.cc \
or foo.h should include a .h file that exports the declaration of that \
symbol. The include-what-you-use program is a tool to analyze includes \
of source files to find include-what-you-use violations, and suggest \
fixes for them. \
 \
The main goal of include-what-you-use is to remove superfluous includes. \
It does this both by figuring out what includes are not actually needed \
for this file (for both .cc and .h files), and replacing includes with \
forward declarations when possible."
LICENSE = "NCSA"

PV = "0.20"

RPM_NAME = "include-what-you-use-0.20-1.2.aarch64.rpm"
RPM_HASH = "a7ce50f3d1aafc386228b79f4cb01c7ccf5e36c4f514a1f5091da1c7b14723ffc9e7c17403262483181b73e9557f47af35bd8f888e2e2f021a78611684a59258"

RPROVIDES:${PN} += "include-what-you-use"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.16 \
libc.so.6 \
libclang-cpp.so.16 \
libstdc++.so.6"

inherit rpm
