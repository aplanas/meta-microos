SUMMARY = "Recovery and prevention of Repetitive Strain Injury program"
DESCRIPTION = "Workrave is a program that assists in the recovery and prevention of Repetitive Strain Injury (RSI). The program frequently alerts you to take micro-pauses, rest breaks and restricts you to your daily limit."
LICENSE = "GPL-3.0-only"

PV = "1.10.50"

RPM_NAME = "workrave-1.10.50-2.2.aarch64.rpm"
RPM_HASH = "a4f2d20c70e3358119133f58a2888b852ac4079490b9b939bb592a8f5ce81cca279881dff641e1b2695370750def77e0b6816e7d3ef6fa6bfa795607a996e2ab"

RPROVIDES:${PN} += "libworkrave-private-1.0.so.0 \
workrave"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXss.so.1 \
libXtst.so.6 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairo.so.2 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
typelib-Clutter \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-St \
typelib-Workrave"

inherit rpm
