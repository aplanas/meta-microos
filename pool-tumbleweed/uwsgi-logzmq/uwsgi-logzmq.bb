SUMMARY = "ZMQ Logger for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for ZMQ logging."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-logzmq-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "cc02d024201c9657c35a5a71310be059ab9ab84825bdd809b06a8f0849a4e1baa7aaa8b704b825ffbdefe91261093aca639e8c1950556acbd9510097b73a61f6"

RPROVIDES:${PN} += "uwsgi-logzmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmq.so.5 \
uwsgi"

inherit rpm
