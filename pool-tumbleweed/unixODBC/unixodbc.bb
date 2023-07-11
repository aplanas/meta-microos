SUMMARY = "ODBC driver manager with some drivers included"
DESCRIPTION = "UnixODBC aims to provide a complete ODBC solution for the Linux \
platform. Further drivers can be found at http://www.unixodbc.org/."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.11"

RPM_NAME = "unixODBC-2.3.11-2.5.aarch64.rpm"
RPM_HASH = "3fb6484e3b09a7df7ac92bae2f2b67e452f2e4af92760d8621a794e2174b33b7a74fdeb0b518845c49e2c5d708b8cd6e9ba615755453eb0bf4fd374a6e150067"

RPROVIDES:${PN} += "config-unixODBC \
libnn.so.1 \
libtemplate.so.1 \
unixODBC"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libltdl.so.7 \
libodbc.so.2 \
libodbcinst.so.2 \
libreadline.so.8"

inherit rpm
