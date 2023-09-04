SUMMARY = "PyPy Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Python applications using PyPy."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-pypy-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "afbee6b4871032e57a46fee062168158e0545662c7904b890a633a239cd84a488040c48d165694b542a4f08c631a7abcc1e37a8f2f43e6e197520d51be508cb1"

RPROVIDES:${PN} += "uwsgi-pypy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
uwsgi"

inherit rpm
