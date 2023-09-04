SUMMARY = "Core library for the Rygel UPnP/DLNA media server"
DESCRIPTION = "Rygel is a home media server that allows sharing audio, video, \
pictures, and control of media player on your home network. \
 \
This package provides the core library of rygel."
LICENSE = "LGPL-2.0-or-later"

PV = "0.42.4"

RPM_NAME = "librygel-core-2_8-0-0.42.4-1.1.aarch64.rpm"
RPM_HASH = "540779fcee7b2572d24e401c2509e9621bb7264afb16d5620099b6bb348fbe7952880ca8a42c7917f80103d36c6789fb5892262a7ffc25037f5aa1175734440d"

RPROVIDES:${PN} += "librygel-core-2-8-0 \
librygel-core-2.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgssdp-1.6.so.0 \
libgupnp-1.6.so.0 \
libxml2.so.2"

inherit rpm
