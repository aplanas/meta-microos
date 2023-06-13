SUMMARY = "Command line client for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The elfutils-debuginfod-client package contains a command-line frontend. \
The package is dummy."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-dummy-client-0.189-3.1.aarch64.rpm"
RPM_HASH = "dba70787a4aefd9aa6061eee558f52d24154b587b72ac164e9f49109219d99397ee3b5260e79bf3f845ab59faf4cef366680f8cd81a1132de97aa9168e89311b"

RPROVIDES:${PN} += "debuginfod-client \
debuginfod-dummy-client \
debuginfod-dummy-client(aarch-64)"

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
