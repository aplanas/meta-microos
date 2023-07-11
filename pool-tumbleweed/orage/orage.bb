SUMMARY = "Time-managing Application for the Xfce Desktop Environment"
DESCRIPTION = "Orage is a fast and easy to use graphical calendar for the Xfce desktop \
environment. It uses the portable ical format and includes common calendar \
features like repeating appointments and multiple alarming possibilities. Orage \
does not have group calendar features and can only be used for single user."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "orage-4.18.0-1.4.aarch64.rpm"
RPM_HASH = "f025bd1f7f841317b80208af7ea1d2f1f594519998c58a9f17733c15f44641b891bf383baa5fc0561159c89f18c43e87f5a019918c8c0059885caf6089a80d42"

RPROVIDES:${PN} += "orage \
orage-doc \
xfcalendar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libical.so.3 \
libicalss.so.3 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm
