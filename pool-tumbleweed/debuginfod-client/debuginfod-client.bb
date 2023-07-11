SUMMARY = "Command line client for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The elfutils-debuginfod-client package contains a command-line frontend."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-client-0.189-3.2.aarch64.rpm"
RPM_HASH = "b8996360b90e797691fe5284bb23f1a26ed43c324d4beeaffbfd304a5db31d24bb7a38e3f29c4b7cbf6e1c654f3558f378138efb8f0f321a3497bd94faccbc4e"

RPROVIDES:${PN} += "debuginfod-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdebuginfod.so.1 \
libdw.so.1 \
libelf.so.1"

inherit rpm
