SUMMARY = "ZeroMQ Emperor Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains an emperor plugin allowing for configuration of \
applications (vassals) via ZeroMQ."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-emperor_zeromq-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "f5e347e3f3e3b785d2e0f72529a6b2051f84564e38cafbd1893e146c6dece2b0d779cc3a63d87bfc686f33a970feeb6687a33322ac5f9f2960b2cb948ad5b9f1"

RPROVIDES:${PN} += "uwsgi-emperor-zeromq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
uwsgi"

inherit rpm
