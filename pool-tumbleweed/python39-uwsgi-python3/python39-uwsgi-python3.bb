SUMMARY = "Python 3.9 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python 3.9 applications via the WSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "python39-uwsgi-python3-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "e9dfce319e13a3b65129302375782e44a3f09aa1bcf494363bfbe1d4cd713eeaa846903d6efc8a3db5096bbb3149931a899d32349c064bb0303feb44bcaf7356"

RPROVIDES:${PN} += "python39-uwsgi-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.9.so.1.0 \
python-abi \
uwsgi"

inherit rpm
