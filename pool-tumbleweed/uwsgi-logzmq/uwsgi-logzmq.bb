SUMMARY = "ZMQ Logger for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for ZMQ logging."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-logzmq-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "4e81c9775078201089dd866fd0ac705df9c9cfbcaba947ac2ed9d5ae6874d51d5cfa725116aac50d31c62420ce5a67279386b29885d36455b8e5405973e61afc"

RPROVIDES:${PN} += "uwsgi-logzmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
uwsgi"

inherit rpm
