SUMMARY = "Command line client for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The elfutils-debuginfod-client package contains a command-line frontend. \
The package is dummy."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-dummy-client-0.189-2.3.aarch64.rpm"
RPM_HASH = "79404202d6abdff56898d239a9013e30397c9d01efbd1436668f27398a87b301af55124210fe2541f72c5bb973840564c846dec37632f9e71eb4e84ad9884020"

RPROVIDES:${PN} += "debuginfod-client debuginfod-dummy-client debuginfod-dummy-client(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdebuginfod.so.1()(64bit) libdebuginfod.so.1(ELFUTILS_0.178)(64bit) libdebuginfod.so.1(ELFUTILS_0.179)(64bit) libdebuginfod.so.1(ELFUTILS_0.183)(64bit) libdebuginfod.so.1(ELFUTILS_0.188)(64bit) libdw.so.1()(64bit) libdw.so.1(ELFUTILS_0.159)(64bit) libdw.so.1(ELFUTILS_0.177)(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit)"

inherit rpm
