SUMMARY = "Services and D-Bus APIs to access UPnP and DLNA media devices in a network"
DESCRIPTION = "dLeyna is a set of services and D-Bus APIs that aim to simplify \
access to UPnP and DLNA media devices in a network."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "dLeyna-0.8.2-2.3.aarch64.rpm"
RPM_HASH = "f8574a647eccca7281dbe1b6ea7baa63864be1e9b92e3d10928b7c004e8e00bc76e069233484793bab290d7512b1f6deccda07b724ab528c522e00c476cb40f5"

RPROVIDES:${PN} += "config(dLeyna) \
dLeyna \
dLeyna(aarch-64) \
dbus(com.intel.dleyna-renderer) \
dbus(com.intel.dleyna-server) \
dleyna-connector-dbus \
dleyna-core \
dleyna-renderer \
dleyna-server \
libdleyna-connector-dbus.so()(64bit) \
libdleyna-core-1.0.so.6()(64bit) \
libdleyna-core-1_0-6 \
libdleyna-renderer-1.0.so.1()(64bit) \
libdleyna-server-1.0.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgssdp-1.6.so.0()(64bit) \
libgupnp-1.6.so.0()(64bit) \
libgupnp-av-1.0.so.3()(64bit) \
libgupnp-dlna-2.0.so.4()(64bit) \
libsoup-3.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
python(abi)"

inherit rpm
