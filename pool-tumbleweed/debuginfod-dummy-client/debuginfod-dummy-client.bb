SUMMARY = "Command line client for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The elfutils-debuginfod-client package contains a command-line frontend. \
The package is dummy."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-dummy-client-0.189-4.1.aarch64.rpm"
RPM_HASH = "15e113fc35d104846d05ba3096eb88d270522a8d82ac8abf422d0e23074da833659d48bffb5f962be1415c6cf3a143307cd5a5213fba8d7d563fb599a1044065"

RPROVIDES:${PN} += "debuginfod-client \
debuginfod-dummy-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdebuginfod.so.1 \
libdw.so.1 \
libelf.so.1"

inherit rpm
