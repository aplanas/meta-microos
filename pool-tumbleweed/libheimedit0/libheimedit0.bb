SUMMARY = "libedit fork of the Heimdal Kerberos project"
DESCRIPTION = "libedit is a command line editing and history library. It is \
designed to be used by interactive programs that allow the user \
to type commands at a terminal prompt."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libheimedit0-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "b9480185dfcc69277ddb7eaaf507f15283cd4a423a3142f28cb1ecd519ef889c9f12b30ab4a593991501120947c05ee1d612449992f8b62e7b80154ec20db4dc"

RPROVIDES:${PN} += "libheimedit.so.0 \
libheimedit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
