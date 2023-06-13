SUMMARY = "ODBC driver manager with some drivers included"
DESCRIPTION = "UnixODBC aims to provide a complete ODBC solution for the Linux \
platform. Further drivers can be found at http://www.unixodbc.org/."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.11"

RPM_NAME = "unixODBC-2.3.11-2.4.aarch64.rpm"
RPM_HASH = "de6662e3f4c84fa37c4efad14b49bb6d3060c99b381c50d20c80db5d1b121ec2c9be9cc5055f42b733ac504f16ba331b016c8e73e0a6682f4cca9ed0917edee1"

RPROVIDES:${PN} += "config(unixODBC) \
libnn.so.1()(64bit) \
libtemplate.so.1()(64bit) \
unixODBC \
unixODBC(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libltdl.so.7()(64bit) \
libodbc.so.2()(64bit) \
libodbcinst.so.2()(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
