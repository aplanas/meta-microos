SUMMARY = "Debuginfod server provided by elfutils"
DESCRIPTION = "The elfutils-debuginfod package contains the debuginfod binary \
and control files for a service that can provide ELF/DWARF \
files to remote clients, based on build-id identification. \
The ELF/DWARF file searching functions in libdwfl can query \
such servers to download those files on demand."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-debuginfod-0.189-2.3.aarch64.rpm"
RPM_HASH = "78dbf26d3abda60ed91d8410cb17da91de7d08da73de6d51e83101a863c79e2f92fbcac9615de2aee1a07c1d56b9874797ae92598068ff7cd045bd04400d367e"

RPROVIDES:${PN} += "elfutils-debuginfod elfutils-debuginfod(aarch-64) group(debuginfod) user(debuginfod)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch debuginfod-client elfutils fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libarchive.so.13()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdebuginfod.so.1()(64bit) libdebuginfod.so.1(ELFUTILS_0.178)(64bit) libdebuginfod.so.1(ELFUTILS_0.179)(64bit) libdebuginfod.so.1(ELFUTILS_0.188)(64bit) libdw.so.1()(64bit) libdw.so.1(ELFUTILS_0.122)(64bit) libdw.so.1(ELFUTILS_0.127)(64bit) libdw.so.1(ELFUTILS_0.159)(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.5)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmicrohttpd.so.12()(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) sysuser-shadow"

inherit rpm
