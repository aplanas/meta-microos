SUMMARY = "Recovery and prevention of Repetitive Strain Injury program"
DESCRIPTION = "Workrave is a program that assists in the recovery and prevention of Repetitive Strain Injury (RSI). The program frequently alerts you to take micro-pauses, rest breaks and restricts you to your daily limit."
LICENSE = "GPL-3.0-only"

PV = "1.10.50"

RPM_NAME = "workrave-1.10.50-2.2.aarch64.rpm"
RPM_HASH = "a4f2d20c70e3358119133f58a2888b852ac4079490b9b939bb592a8f5ce81cca279881dff641e1b2695370750def77e0b6816e7d3ef6fa6bfa795607a996e2ab"

RPROVIDES:${PN} += "application() \
application(workrave.desktop) \
libworkrave-private-1.0.so.0()(64bit) \
metainfo() \
metainfo(workrave.appdata.xml) \
workrave \
workrave(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXss.so.1()(64bit) \
libXtst.so.6()(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcairomm-1.0.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpangomm-1.4.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
typelib(Clutter) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(St) \
typelib(Workrave)"

inherit rpm
