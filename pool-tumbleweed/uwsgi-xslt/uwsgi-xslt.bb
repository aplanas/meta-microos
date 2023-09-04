SUMMARY = "XSLT Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for rendering XML content using XSLT."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-xslt-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "4df0c945bc336be9e171654987e1653248f64a1d44335b94337608c631e32735b073f4bea878fae357c2f064745b505b75f284531f2cc5b8a685c103db0da162"

RPROVIDES:${PN} += "uwsgi-xslt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
libxslt.so.1 \
uwsgi"

inherit rpm
