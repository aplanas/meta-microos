SUMMARY = "Python 3.11 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python 3.11 applications via the WSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "python311-uwsgi-python3-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "4a103223bc3c065d36d8336bf65ae295f1ad2a9668427cb59da5fa4dbf0f596e5972676bf155292b7ac10b1a8c66163596a93da5e32720d1f9c969dff7117d97"

RPROVIDES:${PN} += "python3-uwsgi-python3 \
python311-uwsgi-python3 \
uwsgi-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
python-abi \
uwsgi"

inherit rpm
