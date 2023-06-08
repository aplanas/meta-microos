SUMMARY = "Higher-level library to access ELF files"
DESCRIPTION = "elfutils is a collection of utilities and libraries to read, create \
and modify ELF binary files, find and handle DWARF debug data, \
symbols, thread state and stacktraces for processes and core files."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "elfutils-0.189-2.3.aarch64.rpm"
RPM_HASH = "f48e0feb1d60c6a40d24aa6ab77472965ca1f9a827828ff09998e791e1de0ecf2998c3533613975945ea383b907e83b7e0bf931b6bc18796e539dc1361767e96"

RPROVIDES:${PN} += "elfutils elfutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasm.so.1()(64bit) libasm.so.1(ELFUTILS_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdw.so.1()(64bit) libdw.so.1(ELFUTILS_0.122)(64bit) libdw.so.1(ELFUTILS_0.126)(64bit) libdw.so.1(ELFUTILS_0.127)(64bit) libdw.so.1(ELFUTILS_0.130)(64bit) libdw.so.1(ELFUTILS_0.138)(64bit) libdw.so.1(ELFUTILS_0.143)(64bit) libdw.so.1(ELFUTILS_0.148)(64bit) libdw.so.1(ELFUTILS_0.149)(64bit) libdw.so.1(ELFUTILS_0.158)(64bit) libdw.so.1(ELFUTILS_0.159)(64bit) libdw.so.1(ELFUTILS_0.160)(64bit) libdw.so.1(ELFUTILS_0.161)(64bit) libdw.so.1(ELFUTILS_0.165)(64bit) libdw.so.1(ELFUTILS_0.167)(64bit) libdw.so.1(ELFUTILS_0.171)(64bit) libdw.so.1(ELFUTILS_0.173)(64bit) libdw.so.1(ELFUTILS_0.177)(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.1)(64bit) libelf.so.1(ELFUTILS_1.1.1)(64bit) libelf.so.1(ELFUTILS_1.2)(64bit) libelf.so.1(ELFUTILS_1.3)(64bit) libelf.so.1(ELFUTILS_1.4)(64bit) libelf.so.1(ELFUTILS_1.5)(64bit) libelf.so.1(ELFUTILS_1.6)(64bit) libelf.so.1(ELFUTILS_1.7)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
