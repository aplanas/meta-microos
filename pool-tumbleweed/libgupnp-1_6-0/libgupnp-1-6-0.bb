SUMMARY = "Implementation of the UPnP specification"
DESCRIPTION = "GUPnP implements the UPnP specification: resource announcement and \
discovery, description, control, event notification, and presentation \
(GUPnP includes basic web server functionality through libsoup). GUPnP \
does not include helpers for construction or control of specific \
standardized resources (e.g. MediaServer); this is left for higher level \
libraries utilizing the GUPnP framework."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.5"

RPM_NAME = "libgupnp-1_6-0-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "4cd63901ff5d62a855b299a9fbbd93b4bf996d16dd1d1e45f984446d169516b092c66b9ffd4a96a5ad75c194c49fab8dbf20f2a93435b537a6b25841210187ef"

RPROVIDES:${PN} += "libgupnp-1-6-0 \
libgupnp-1.6.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgssdp-1.6.so.0 \
libsoup-3.0.so.0 \
libxml2.so.2"

inherit rpm
