SUMMARY = "Python 3.10 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python 3.10 applications via the WSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "python310-uwsgi-python3-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "f85681b501944d2829e35f49188a75b2950ca119504694a1b2f55ec040543cfe282c2bf63eae2604e9f6edda3ea8f711e19720efdb5d8677ce19f8d252787103"

RPROVIDES:${PN} += "python310-uwsgi-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.10.so.1.0 \
python-abi \
uwsgi"

inherit rpm
