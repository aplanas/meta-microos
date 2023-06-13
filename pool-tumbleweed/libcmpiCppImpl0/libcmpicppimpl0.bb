SUMMARY = "SBLIM CMPI Provider Development Support"
DESCRIPTION = "This packages provides the C and C++ CMPI header files needed by \
provider developers and can be used standalone. If used for C++ \
provider development it is also necessary to have tog-pegasus-devel \
installed."
LICENSE = "EPL-1.0"

PV = "2.0.3"

RPM_NAME = "libcmpiCppImpl0-2.0.3-8.26.aarch64.rpm"
RPM_HASH = "fe57224fcb583f2434d79a81b4649331dfe6bf416657e91b9ec05969b5a440a8e7cabb022575ecff98dca584b7ad9ff57b7dd106f13b6d0fc7e92cf99b709b5b"

RPROVIDES:${PN} += "libcmpiCppImpl.so.0()(64bit) \
libcmpiCppImpl0 \
libcmpiCppImpl0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
