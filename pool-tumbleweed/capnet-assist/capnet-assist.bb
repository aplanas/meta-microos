SUMMARY = "Captive Portal Assistant"
DESCRIPTION = "Assists users in connective to Captive Portals such as those found on \
public access points in train stations, coffee shops, universities, etc. \
Upon detection, the assistant appears showing the captive portal. Once a \
connection is known to have been established, it dismisses itself. Written \
in Vala and using WebkitGtk+."
LICENSE = "GPL-3.0-only"

PV = "2.4.2"

RPM_NAME = "capnet-assist-2.4.2-1.4.aarch64.rpm"
RPM_HASH = "85ef7d2099afd0fc4f266d9cdacf729958b974bf518c9c0641556bacd65d7e6dd3b4b0d897d0025e787d7bb39eec284918dc90cac4022b022efb5208bfad3005"

RPROVIDES:${PN} += "application() \
application(io.elementary.capnet-assist.desktop) \
capnet-assist \
capnet-assist(aarch-64) \
elementary-capnet-assist \
metainfo() \
metainfo(io.elementary.capnet-assist.appdata.xml)"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcr-base-3.so.1()(64bit) \
libgcr-ui-3.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libwebkit2gtk-4.0.so.37()(64bit)"

inherit rpm
