SUMMARY = "Python 3.10 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python 3.10 applications via the WSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "python310-uwsgi-python3-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "ff7dcc890443ce47cab9e3024cee00fd4b84d4ae89732747b206cfb1c303d114fb6392c0b7f16aab259c5ffa9e12e82e1fa94883da78e696645b32b9e8af8587"

RPROVIDES:${PN} += "python3-uwsgi-python3 \
python310-uwsgi-python3 \
uwsgi-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.10.so.1.0 \
python-abi \
uwsgi"

inherit rpm
