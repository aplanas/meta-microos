SUMMARY = "Gevent Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python Gevent, which is a non-blocking \
networking framework."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-gevent-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "543c575590e629d16c3c8e13ef42c79648a2c2ff9dd40edc0bd7a9694a0b5ca1560f66f8ec223c77773d89478a6b04e11c881b7254d04ceba6604f9217692f53"

RPROVIDES:${PN} += "uwsgi-gevent \
uwsgi-gevent(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
uwsgi \
uwsgi-python3"

inherit rpm
