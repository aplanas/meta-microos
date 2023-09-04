SUMMARY = "Gevent Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python Gevent, which is a non-blocking \
networking framework."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-gevent-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "20eb498326bea445163fcf0833414fe945b64856b96abdefc08c3938da7d8706a067a87f0b07b0dce58114334125bef733b6a3eaece7f672942b85f575531687"

RPROVIDES:${PN} += "uwsgi-gevent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
uwsgi \
uwsgi-python3"

inherit rpm
