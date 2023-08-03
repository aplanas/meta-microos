SUMMARY = "Command line client for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The elfutils-debuginfod-client package contains a command-line frontend."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-client-0.189-4.1.aarch64.rpm"
RPM_HASH = "380bfd009a5a39f9e5fe675ad1ae173949dfc193a2f24cb97f41f99036da83310c19500a68f9d6ca4bbaf4d360fa1ed204f3fd83d97bae04ded75b3a2bcc07da"

RPROVIDES:${PN} += "debuginfod-client"

RDEPENDS:${PN} += "config-debuginfod-profile \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdebuginfod.so.1 \
libdw.so.1 \
libelf.so.1"

inherit rpm
