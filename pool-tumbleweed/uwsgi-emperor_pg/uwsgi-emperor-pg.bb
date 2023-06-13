SUMMARY = "PostgreSQL Emperor Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains an emperor plugin allowing for configuration of \
applications (vassals) in a PostgreSQL database."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-emperor_pg-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "96ffa0bf913aede5a903eaf0addf3c4af449eea031126ca59452e001efd578f4960cc690969607329071db3670f33957de0497fe82fc100c7ef0f1f4388e9685"

RPROVIDES:${PN} += "uwsgi-emperor_pg \
uwsgi-emperor_pg(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libpq.so.5()(64bit) \
uwsgi"

inherit rpm
