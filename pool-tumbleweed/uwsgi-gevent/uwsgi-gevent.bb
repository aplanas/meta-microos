SUMMARY = "Gevent Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python Gevent, which is a non-blocking \
networking framework."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-gevent-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "7491299d5d9c087a620e76c251f11828eaecf0e6b1d59ba128a02be6c4b138924323e34748fdc117bdc5c1695f793452bb0c270db4157ce78f58fb3d2068c8d1"

RPROVIDES:${PN} += "uwsgi-gevent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
uwsgi \
uwsgi-python3"

inherit rpm
