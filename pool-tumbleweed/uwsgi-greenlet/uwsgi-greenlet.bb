SUMMARY = "Greenlet Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for the Python Greenlet non-blocking network \
framework."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-greenlet-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "1cd766e8d754ea3dcc5a72c5cbe15676c99d6e891772689e9c9a919fd66d722dee97ffc3cee8809aa7b65fb2a2c8e5138dd29d468366de91f9ba5654b3086dd2"

RPROVIDES:${PN} += "uwsgi-greenlet"

RDEPENDS:${PN} += "libc.so.6 \
uwsgi \
uwsgi-python3"

inherit rpm
