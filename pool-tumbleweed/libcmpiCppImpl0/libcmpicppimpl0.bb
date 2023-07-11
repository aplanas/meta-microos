SUMMARY = "SBLIM CMPI Provider Development Support"
DESCRIPTION = "This packages provides the C and C++ CMPI header files needed by \
provider developers and can be used standalone. If used for C++ \
provider development it is also necessary to have tog-pegasus-devel \
installed."
LICENSE = "EPL-1.0"

PV = "2.0.3"

RPM_NAME = "libcmpiCppImpl0-2.0.3-8.27.aarch64.rpm"
RPM_HASH = "51cca55c3f25286a6b6b75fad0c2d393b09f09a60597835037ae96294e0e6f38b178ff17770b71a679631584623fc82580e227ad45fce09e882d076dcceba394"

RPROVIDES:${PN} += "libcmpiCppImpl.so.0 \
libcmpiCppImpl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
