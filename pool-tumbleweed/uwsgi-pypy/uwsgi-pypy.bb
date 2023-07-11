SUMMARY = "PyPy Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python applications using PyPy."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-pypy-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "c5af459c44490718269b8df6db56eee8337243eab62b77e3c846a3088538b82eb4811e90df6486a08a0724f761846f5893fc5249daa561e31b42019862cb33d4"

RPROVIDES:${PN} += "uwsgi-pypy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
uwsgi"

inherit rpm
