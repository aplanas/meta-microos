SUMMARY = "Nemiver graphical debugger"
DESCRIPTION = "Nemiver is a standalone graphical debugger that integrates well in the \
GNOME desktop environment. It currently features a backend which uses \
the well known GNU Debugger gdb to debug C / C++ programs."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.6"

RPM_NAME = "nemiver-0.9.6-9.9.aarch64.rpm"
RPM_HASH = "e9572bfcf42bac08112f8cf68401eeb83d09743fe95b85c77acb838fee37009c9676f9097789b7187ed981ed673ca9892bc5a09170b294cbf11e7242ecc18930"

RPROVIDES:${PN} += "libcpptraitmod.so \
libdbgperspectiveplugin.so \
libgdbmod.so \
libgsettingsmgrmod.so \
libnemivercommon.so \
libnemiverdbdsqlite.so \
libvarlistmod.so \
libvarlistwalkermod.so \
libvarobjwalkermod.so \
libvarwalkermod.so \
libworkbenchmod.so \
nemiver"

RDEPENDS:${PN} += "gdb \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgdlmm-3.0.so.2 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libgtksourceviewmm-3.0.so.0 \
libgtop-2.0.so.11 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libvte-2.91.so.0 \
libxml2.so.2"

inherit rpm
