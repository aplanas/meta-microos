SUMMARY = "Collaborative editor (Infinote protocol)"
DESCRIPTION = "This is a collaborative editor, which means that it provides \
the possibility to edit files simultaneously with other users over \
a network. It supports multiple documents in one session. \
 \
This version of Gobby uses the Infinote protocol."
LICENSE = "GPL-2.0-or-later & ISC"

PV = "0.5.1+20180826.d16519e"

RPM_NAME = "gobby-0.5.1+20180826.d16519e-2.11.aarch64.rpm"
RPM_HASH = "cb42daa94cd48764175b4b90251d48bd2528c96b4d16a969a8a26b296ef9207cd480162b598156617a3bee0488036c15c38507fc414cd81a7916776ba8dfda16"

RPROVIDES:${PN} += "gobby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkmm-3.0.so.1 \
libgtksourceview-3.0.so.1 \
libinfgtk-0.7.so.0 \
libinfinity-0.7.so.0 \
libinftext-0.7.so.0 \
libinftextgtk-0.7.so.0 \
libm.so.6 \
libpangomm-1.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libxml++-2.6.so.2 \
update-alternatives"

inherit rpm
