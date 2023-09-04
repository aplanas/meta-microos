SUMMARY = "Python 3.10 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python 3.10 applications via the WSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "python310-uwsgi-python3-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "4b08b759ccd2894e31504505b3224da28add5770ed2b12b9455193759eec7381948d40075cc61a0f002bcb778535073673c5d30c22c47487f738f4dd7b878b3b"

RPROVIDES:${PN} += "python310-uwsgi-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.10.so.1.0 \
python-abi \
uwsgi"

inherit rpm
