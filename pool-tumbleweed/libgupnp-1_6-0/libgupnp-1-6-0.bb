SUMMARY = "Implementation of the UPnP specification"
DESCRIPTION = "GUPnP implements the UPnP specification: resource announcement and \
discovery, description, control, event notification, and presentation \
(GUPnP includes basic web server functionality through libsoup). GUPnP \
does not include helpers for construction or control of specific \
standardized resources (e.g. MediaServer); this is left for higher level \
libraries utilizing the GUPnP framework."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "libgupnp-1_6-0-1.6.3-3.1.aarch64.rpm"
RPM_HASH = "55a784a59954cdb9a245741d1ba29bef662820e56bdd1df88fa8972a4f9d816360b2e596b8a335b6f64c2a5a74d7378ee5f96517306db449f4fb546276da3f31"

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
