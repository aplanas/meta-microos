SUMMARY = "Find peak OpenCL capacities like bandwidth & compute"
DESCRIPTION = "A tool which profiles OpenCL devices to find their peak capacities like \
bandwidth & compute."
LICENSE = "SUSE-Public-Domain"

PV = "1.1.2"

RPM_NAME = "clpeak-1.1.2-1.1.aarch64.rpm"
RPM_HASH = "247030242af6021b94cd918b12f90ca2e49a50fb18574f175bd0c3f7d65e534a8d7928d4652132470fb3d50ce586d26e09091e58462e8746d62432efb1df3694"

RPROVIDES:${PN} += "clpeak \
clpeak(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libOpenCL.so.1()(64bit) \
libOpenCL.so.1(OPENCL_1.0)(64bit) \
libOpenCL.so.1(OPENCL_1.2)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm