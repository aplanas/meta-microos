SUMMARY = "Records nondeterministic executions and debugs them deterministically"
DESCRIPTION = "This program aspires to be your primary debugging tool, enhancing gdb. It \
also provides efficient reverse execution under gdb. Set breakpoints and \
data watchpoints and quickly reverse-execute to where they were hit."
LICENSE = "MIT"

PV = "5.6.0"

RPM_NAME = "rr-5.6.0-3.2.aarch64.rpm"
RPM_HASH = "381041e685dc1cead659a37ff02f3415ca876d28c3440a997751abbec9d96120315f6765403ff834d72b71c435813d904cf5eda0810d36ac855d19cefbcc7535"

RPROVIDES:${PN} += "librraudit.so()(64bit) \
librrpreload.so()(64bit) \
rr \
rr(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcapnp-0.10.3.so()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkj-0.10.3.so()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
