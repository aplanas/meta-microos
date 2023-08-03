SUMMARY = "Services and D-Bus APIs to access UPnP and DLNA media devices in a network"
DESCRIPTION = "dLeyna is a set of services and D-Bus APIs that aim to simplify \
access to UPnP and DLNA media devices in a network."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "dLeyna-0.8.2-3.1.aarch64.rpm"
RPM_HASH = "2e4ee16b3827f096d7138f1e3d180925e1cbc3a31ba37b4963c068435baca12644a441225638b780ccf2f490272512dedcbc7e01d30ede64c1c87a400bfc7a1e"

RPROVIDES:${PN} += "config-dLeyna \
dLeyna \
dbus-com.intel.dleyna-renderer \
dbus-com.intel.dleyna-server \
dleyna-connector-dbus \
dleyna-core \
dleyna-renderer \
dleyna-server \
libdleyna-connector-dbus.so \
libdleyna-core-1-0-6 \
libdleyna-core-1.0.so.6 \
libdleyna-renderer-1.0.so.1 \
libdleyna-server-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgssdp-1.6.so.0 \
libgupnp-1.6.so.0 \
libgupnp-av-1.0.so.3 \
libgupnp-dlna-2.0.so.4 \
libsoup-3.0.so.0 \
libxml2.so.2 \
python-abi"

inherit rpm
