SUMMARY = "XSLT Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for rendering XML content using XSLT."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-xslt-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "112f8e97b2a76f0ff6faadddb653fc809e8b3af25f0a6cd1d95715eaafc837dbf9dc708fba4a2f917804c108310e8189c02fbb3047aa9912b07604a3228c63b9"

RPROVIDES:${PN} += "uwsgi-xslt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
libxslt.so.1 \
uwsgi"

inherit rpm
