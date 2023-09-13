SUMMARY = "Command line client for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The elfutils-debuginfod-client package contains a command-line frontend."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-client-0.189-5.1.aarch64.rpm"
RPM_HASH = "1850bc84d12afd98f6c47209d0ff1d0ae366d56d8fd09f6e3412f910a3d61e46027c00832949a1294bfe9d8a22a663dc70d162b8c289d67b1536d94bc0957b09"

RPROVIDES:${PN} += "debuginfod-client"

RDEPENDS:${PN} += "config-debuginfod-profile \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdebuginfod.so.1 \
libdw.so.1 \
libelf.so.1"

inherit rpm
