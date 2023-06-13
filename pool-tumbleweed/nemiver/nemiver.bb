SUMMARY = "Nemiver graphical debugger"
DESCRIPTION = "Nemiver is a standalone graphical debugger that integrates well in the \
GNOME desktop environment. It currently features a backend which uses \
the well known GNU Debugger gdb to debug C / C++ programs."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.6"

RPM_NAME = "nemiver-0.9.6-9.8.aarch64.rpm"
RPM_HASH = "543edaa195cee4b6c6e7dabcd1acd91fe1f3135a424ad77de03e6023b6dc61dac2cde0e4868b35394eaa04ff081798c7cb1da37ad0357cdd5defdb4876cdd368"

RPROVIDES:${PN} += "application() \
application(nemiver.desktop) \
libcpptraitmod.so()(64bit) \
libdbgperspectiveplugin.so()(64bit) \
libgdbmod.so()(64bit) \
libgsettingsmgrmod.so()(64bit) \
libnemivercommon.so()(64bit) \
libnemiverdbdsqlite.so()(64bit) \
libvarlistmod.so()(64bit) \
libvarlistwalkermod.so()(64bit) \
libvarobjwalkermod.so()(64bit) \
libvarwalkermod.so()(64bit) \
libworkbenchmod.so()(64bit) \
metainfo() \
metainfo(nemiver.appdata.xml) \
nemiver \
nemiver(aarch-64)"

RDEPENDS:${PN} += "gdb \
ld-linux-aarch64.so.1()(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgdlmm-3.0.so.2()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libgtksourceviewmm-3.0.so.0()(64bit) \
libgtop-2.0.so.11()(64bit) \
libpangomm-1.4.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libvte-2.91.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
