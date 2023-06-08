SUMMARY = "CUPS Client Programs"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. A computer running CUPS is a host that can accept print \
jobs from client computers, process them, and send them to the \
appropriate printer. \
 \
This package contains the traditional command line interfaces for the \
System V and Berkeley print systems."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "cups-client-2.4.2-4.3.aarch64.rpm"
RPM_HASH = "fda9db9b1ef358f83e43ccb89b8e16e8c393de2fb2b573315ea9d7a2c922f155375d005cc62148b44030b3edf2b09043109326eaeb6e17ba495297d2d8dd3bd0"

RPROVIDES:${PN} += "cups-client cups-client(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavahi-client.so.3()(64bit) libavahi-common.so.3()(64bit) libc.so.6(GLIBC_2.36)(64bit) libcups.so.2()(64bit) libcups2 libcupsimage2 libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit)"

inherit rpm
