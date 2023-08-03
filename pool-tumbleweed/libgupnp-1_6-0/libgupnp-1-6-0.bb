SUMMARY = "Implementation of the UPnP specification"
DESCRIPTION = "GUPnP implements the UPnP specification: resource announcement and \
discovery, description, control, event notification, and presentation \
(GUPnP includes basic web server functionality through libsoup). GUPnP \
does not include helpers for construction or control of specific \
standardized resources (e.g. MediaServer); this is left for higher level \
libraries utilizing the GUPnP framework."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.4"

RPM_NAME = "libgupnp-1_6-0-1.6.4-2.1.aarch64.rpm"
RPM_HASH = "c1332152dd932b4922107829b6766f0a750185442f4e28456c7253120fff52b083da3c615874bd727706a9a908e18d3778a822f8b719b65ec69096a0ff5d75c8"

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
