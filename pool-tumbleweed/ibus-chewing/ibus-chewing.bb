SUMMARY = "The Chewing engine for IBus input platform"
DESCRIPTION = "The Chewing engine for IBus platform. It provides Chinese input method from \
libchewing. \
新酷音輸入法"
LICENSE = "GPL-2.0-or-later"

PV = "1.6.1"

RPM_NAME = "ibus-chewing-1.6.1-2.16.aarch64.rpm"
RPM_HASH = "1d3cdd95b6c7bd31877ff749658769a06ce360dcd8a23a48be73acaa6a983547bed06358c1e55f53825a50a57a252d5b9e12bb880a16f17dd488f7fc1b8a720d"

RPROVIDES:${PN} += "application() \
application(ibus-setup-chewing.desktop) \
ibus-chewing \
ibus-chewing(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libchewing.so.3()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libibus-1.0.so.5()(64bit)"

inherit rpm
