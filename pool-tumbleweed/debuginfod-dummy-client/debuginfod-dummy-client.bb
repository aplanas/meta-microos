SUMMARY = "Command line client for build-id HTTP ELF/DWARF server"
DESCRIPTION = "The elfutils-debuginfod-client package contains a command-line frontend. \
The package is dummy."
LICENSE = "GPL-3.0-or-later"

PV = "0.189"

RPM_NAME = "debuginfod-dummy-client-0.189-5.1.aarch64.rpm"
RPM_HASH = "5b66844dd9eb037225ba7b3d56b8b5b9d7ba7cb1ad845073bd7a636fa7e2aeee7118f2d0e80c9159346a8ccb4ca5769c2afbb65a9042f7fe5afef4c83144b8ed"

RPROVIDES:${PN} += "debuginfod-client \
debuginfod-dummy-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdebuginfod.so.1 \
libdw.so.1 \
libelf.so.1"

inherit rpm
