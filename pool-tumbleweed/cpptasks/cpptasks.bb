SUMMARY = "Compile and link task"
DESCRIPTION = "This ant task can compile various source languages and produce \
executables, shared libraries and static libraries. Compiler adaptors \
are currently available for several C/C++ compilers, FORTRAN, \
MIDL and Windows Resource files."
LICENSE = "Apache-2.0"

PV = "1.0b5"

RPM_NAME = "cpptasks-1.0b5-7.15.noarch.rpm"
RPM_HASH = "3e6a4faef887f318d12f8d3b3378d3b3d1318cb45856179ae14ca3d1d20118b3c3ba8fc5a5c00b2bbd6cf629458b7e0a6f27892f070070eaee521ae93d1c1a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-cpptasks \
cpptasks"

RDEPENDS:${PN} += "ant \
java"

inherit rpm
