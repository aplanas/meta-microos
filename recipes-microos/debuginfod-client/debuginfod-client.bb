SUMMARY = "Command line client for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The elfutils-debuginfod-client package contains a command-line frontend."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-client-0.189-2.3.aarch64.rpm"
RPM_HASH = "a79d3b8a8b908bcb3f2e2a03c50437206c145e0b570e7985b3824bde9e52964d95d69385394bcc410c4cddfdd42a0586b0162a0dd6c007f81d54a2f520e0baf8"

RPROVIDES:${PN} += "debuginfod-client debuginfod-client(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdebuginfod.so.1()(64bit) libdebuginfod.so.1(ELFUTILS_0.178)(64bit) libdebuginfod.so.1(ELFUTILS_0.179)(64bit) libdebuginfod.so.1(ELFUTILS_0.183)(64bit) libdebuginfod.so.1(ELFUTILS_0.188)(64bit) libdw.so.1()(64bit) libdw.so.1(ELFUTILS_0.159)(64bit) libdw.so.1(ELFUTILS_0.177)(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit)"

inherit rpm
