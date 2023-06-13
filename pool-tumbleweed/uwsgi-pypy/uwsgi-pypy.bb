SUMMARY = "PyPy Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python applications using PyPy."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-pypy-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "d812d721911140c55e945641841dc8e67f78b941bcce328717aca7be04eb4410ab4b3a7381f325b097e7e76903a4c41f8bee77f0d125d213cfd854f4b0bb6b0e"

RPROVIDES:${PN} += "uwsgi-pypy \
uwsgi-pypy(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
uwsgi"

inherit rpm
