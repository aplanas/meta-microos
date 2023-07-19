SUMMARY = "ODBC driver manager with some drivers included"
DESCRIPTION = "UnixODBC aims to provide a complete ODBC solution for the Linux \
platform. Further drivers can be found at http://www.unixodbc.org/."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.11"

RPM_NAME = "unixODBC-2.3.11-3.1.aarch64.rpm"
RPM_HASH = "594da4f1ff7227fa906423dae9b35636fca97e0b5dd4abe39f32d3b8d0208604dcaa2563282ced842d7f2404ad006d0dcef75c719104880f5bac5d2a24d76369"

RPROVIDES:${PN} += "config-unixODBC \
libnn.so.1 \
libtemplate.so.1 \
unixODBC"

RDEPENDS:${PN} += "glibc-locale-base \
ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7 \
libodbc.so.2 \
libodbcinst.so.2 \
libreadline.so.8"

inherit rpm
