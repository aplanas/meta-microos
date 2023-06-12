SUMMARY = "EXR file import and export for PFS tools"
DESCRIPTION = "This package contains two-way conversion filters between the EXR file \
format and pfstools's HDR graphics file format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfstools-exr-2.2.0-3.14.aarch64.rpm"
RPM_HASH = "7c8a1bbc73140bb2a4ac150ce53d97c60b7a4f716bbd93d9b81056138bad905fdb1692e746e481ccd8e8b84cfffa80c2cc23c89975211ef9900d89476f4eb86c"

RPROVIDES:${PN} += "pfstools-exr \
pfstools-exr(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libOpenEXR-3_1.so.30()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libpfs.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
