SUMMARY = "Greenlet Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for the Python Greenlet non-blocking network \
framework."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-greenlet-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "3735d3c8f2a810b9a419e74ffce7024c97a7d37c3fec394628937279adad666382cd9a346ef6cea7690ee9321c8290e4c62ab2e51faffcdc0961f8a26b1d8f71"

RPROVIDES:${PN} += "uwsgi-greenlet"

RDEPENDS:${PN} += "libc.so.6 \
uwsgi \
uwsgi-python3"

inherit rpm
