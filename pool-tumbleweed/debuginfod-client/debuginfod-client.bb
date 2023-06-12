SUMMARY = "Command line client for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The elfutils-debuginfod-client package contains a command-line frontend."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-client-0.189-3.1.aarch64.rpm"
RPM_HASH = "d962f89fdc2610f12db57d0b935a1c02d1d3e987d658b30685e2bc57e010d6f54949e42c416d7a9dfce7c3e801da42d31010ff48d88b1799d56197ebbba422d8"

RPROVIDES:${PN} += "debuginfod-client \
debuginfod-client(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdebuginfod.so.1()(64bit) \
libdebuginfod.so.1(ELFUTILS_0.178)(64bit) \
libdebuginfod.so.1(ELFUTILS_0.179)(64bit) \
libdebuginfod.so.1(ELFUTILS_0.183)(64bit) \
libdebuginfod.so.1(ELFUTILS_0.188)(64bit) \
libdw.so.1()(64bit) \
libdw.so.1(ELFUTILS_0.159)(64bit) \
libdw.so.1(ELFUTILS_0.177)(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit)"

inherit rpm
