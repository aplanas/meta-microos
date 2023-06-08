SUMMARY = "General-purpose programming language and runtime environment"
DESCRIPTION = "Erlang is a general-purpose programming language and runtime \
environment. Erlang has built-in support for concurrency, distribution \
and fault tolerance. Erlang is used in several large telecommunication \
systems from Ericsson."
LICENSE = "Apache-2.0"

PV = "25.3"

RPM_NAME = "erlang-25.3-1.1.aarch64.rpm"
RPM_HASH = "d7fb110016eacb5995353c149cb7aaf79f3727ef8722c30e577fd1d2e762327cbee5f1972816bdad94e8d6116da24271308ec11844a7fcddcd391a1a018bc1f1"

RPROVIDES:${PN} += "erlang erlang(aarch-64) rpm_macro(_erldir) rpm_macro(_erllibdir) rpm_macro(erlang_app_name) rpm_macro(erlang_app_vsn) rpm_macro(erlang_dir) rpm_macro(erlang_libdir)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env erlang-epmd ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libodbc.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.2)(64bit) libz.so.1(ZLIB_1.2.7.1)(64bit)"

inherit rpm
