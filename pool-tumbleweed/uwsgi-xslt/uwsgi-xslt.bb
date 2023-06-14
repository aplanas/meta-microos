SUMMARY = "XSLT Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for rendering XML content using XSLT."
LICENSE = "Apache-2.0 & GPL-2.0-only-WITH-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-xslt-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "001c9c0f639f1d6574d3d9b0699b4dfc993a599d0238192838e179e927ab86112e99ea360e148f1014bef6a5326bac8ebc1a4178a9758a1eafc1177e6573b727"

RPROVIDES:${PN} += "uwsgi-xslt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
libxslt.so.1 \
uwsgi"

inherit rpm
