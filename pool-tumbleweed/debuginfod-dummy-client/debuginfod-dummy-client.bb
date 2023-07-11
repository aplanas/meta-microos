SUMMARY = "Command line client for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The elfutils-debuginfod-client package contains a command-line frontend. \
The package is dummy."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-dummy-client-0.189-3.3.aarch64.rpm"
RPM_HASH = "392e0c1eb26b3853380169915d75a5c80975e5ce3d5e638950e26a88c36c1971de5d443c01d0ceb58493df85ecb880c06e9a16271e419d665b669e64b1c9e3ad"

RPROVIDES:${PN} += "debuginfod-client \
debuginfod-dummy-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdebuginfod.so.1 \
libdw.so.1 \
libelf.so.1"

inherit rpm
