SUMMARY = "Captive Portal Assistant"
DESCRIPTION = "Assists users in connective to Captive Portals such as those found on \
public access points in train stations, coffee shops, universities, etc. \
Upon detection, the assistant appears showing the captive portal. Once a \
connection is known to have been established, it dismisses itself. Written \
in Vala and using WebkitGtk+."
LICENSE = "GPL-3.0-only"

PV = "2.4.2"

RPM_NAME = "capnet-assist-2.4.2-1.5.aarch64.rpm"
RPM_HASH = "1dfa4c61a244a2497c7f27e4d24dc68b4fd57e433533c27d3eb722099d7456a4cc1f5db10d8a393562103c0d0e3467c24048019bdbe2c02dd6bda66facfd5ba1"

RPROVIDES:${PN} += "capnet-assist \
elementary-capnet-assist"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcr-base-3.so.1 \
libgcr-ui-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libwebkit2gtk-4.0.so.37"

inherit rpm
