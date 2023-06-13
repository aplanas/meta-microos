SUMMARY = "Compile and link task"
DESCRIPTION = "This ant task can compile various source languages and produce \
executables, shared libraries and static libraries. Compiler adaptors \
are currently available for several C/C++ compilers, FORTRAN, \
MIDL and Windows Resource files."
LICENSE = "Apache-2.0"

PV = "1.0b5"

RPM_NAME = "cpptasks-1.0b5-7.14.noarch.rpm"
RPM_HASH = "11fcf63ccc8bb8cf4b06f02b0be755095672ddb86c71298daa864a552c68512d9f020b3701e304f08bc4f4f78f380f79ea255e13db05c033d03817f37b8e40e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(cpptasks) \
cpptasks"

RDEPENDS:${PN} += "ant \
java"

inherit rpm
