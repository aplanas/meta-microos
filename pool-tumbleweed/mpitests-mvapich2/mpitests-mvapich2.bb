SUMMARY = "MPI Benchmarks and tests for mvapich2"
DESCRIPTION = "Set of popular MPI benchmarks: IMB v2021.3 OSU benchmarks ver 6.1"
LICENSE = "BSD-3-Clause & CPL-1.0"

PV = "3.2"

RPM_NAME = "mpitests-mvapich2-3.2-11.3.aarch64.rpm"
RPM_HASH = "0da1f652b014d153b959da8db4cb596aeb3b19b1bb1ad8c97bd6c9a478912d8c41cbfda3a04aad3c2b40afd1c22dcc1aae054b359b5b17b9ce55987e2892b0af"

RPROVIDES:${PN} += "mpitests-mvapich2 \
mpitests-mvapich2(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmpi.so.12()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
mpitests \
mvapich2"

inherit rpm
