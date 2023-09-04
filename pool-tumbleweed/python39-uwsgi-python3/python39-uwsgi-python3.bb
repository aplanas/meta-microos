SUMMARY = "Python 3.9 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python 3.9 applications via the WSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "python39-uwsgi-python3-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "2afe36a1e0fe8bbca6fbfa9d863d344ae3391a40ad83d9ae3211cff18597fbc66eb7897ee6b2e48eea357c51f2b482a45b4fa1b064f4c9901510e4f5b9885247"

RPROVIDES:${PN} += "python39-uwsgi-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.9.so.1.0 \
python-abi \
uwsgi"

inherit rpm
