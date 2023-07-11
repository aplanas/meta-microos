SUMMARY = "A collection of helpers for building DLNA applications"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "gupnp-dlna-tools-0.12.0-1.11.aarch64.rpm"
RPM_HASH = "397e11cd1541bba0598f87aa010835165000e0b779f4cc6ecd203efa0e243221af79b127fe3e9e4db8ebba71fd782a2749edff9be14e42c56bb8fe60c34c49bb"

RPROVIDES:${PN} += "gupnp-dlna-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgupnp-dlna-2.0.so.4"

inherit rpm
