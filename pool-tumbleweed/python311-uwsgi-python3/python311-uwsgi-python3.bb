SUMMARY = "Python 3.11 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python 3.11 applications via the WSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "python311-uwsgi-python3-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "a9d7580bfe86e7187df815c909832c17a0c90bbb416eafd96e1e2e877a85d540603fdcfe45c68fc911f6b126a07c1d49534a13583d1e06cef2816b0efab1f0bc"

RPROVIDES:${PN} += "python3-uwsgi-python3 \
python311-uwsgi-python3 \
uwsgi-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
python-abi \
uwsgi"

inherit rpm
