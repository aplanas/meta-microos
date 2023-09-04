SUMMARY = "ODBC driver manager with some drivers included"
DESCRIPTION = "UnixODBC aims to provide a complete ODBC solution for the Linux \
platform. Further drivers can be found at http://www.unixodbc.org/."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.12"

RPM_NAME = "unixODBC-2.3.12-1.1.aarch64.rpm"
RPM_HASH = "35b26df739bb52b8eb757807d47475223c6b8c67e91f0c379b2beb753abd0945ca73c961be95f5f32d0d4543206892737a6b7a1f97eb9efac1bae3c6aa3e4e4a"

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
