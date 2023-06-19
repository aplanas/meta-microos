SUMMARY = "Python 3.11 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python 3.11 applications via the WSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "python311-uwsgi-python3-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "2875fcea254eb86551e406827b56f65d876cebd0388a1880fde9754d8382c89930b1c7b998f79c797a64a2487b5055e7549f8a171a933ac671beb9ee9fa1fdbd"

RPROVIDES:${PN} += "python311-uwsgi-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
python-abi \
uwsgi"

inherit rpm
