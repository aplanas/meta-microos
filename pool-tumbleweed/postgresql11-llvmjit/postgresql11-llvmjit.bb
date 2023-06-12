SUMMARY = "Just-in-time compilation support for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package contains support for just-in-time compiling parts of \
PostgreSQL queries. Using LLVM it compiles e.g. expressions and tuple \
deforming into native code, with the goal of accelerating analytics \
queries."
LICENSE = "PostgreSQL"

PV = "11.20"

RPM_NAME = "postgresql11-llvmjit-11.20-1.2.aarch64.rpm"
RPM_HASH = "b0377ca80bde4ffb79cdf70202c74af35172c50215a96f32abdba928ba83d449ce64b095faa733615f6f6966bfd3d888c355d38cbef9662432e44b7d7d027724"

RPROVIDES:${PN} += "postgresql-llvmjit-implementation \
postgresql11-llvmjit \
postgresql11-llvmjit(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libLLVM.so.15()(64bit) \
libLLVM.so.15(LLVM_15)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
postgresql-llvmjit-noarch \
postgresql11-server"

inherit rpm
