SUMMARY = "Collaborative editor (Infinote protocol)"
DESCRIPTION = "This is a collaborative editor, which means that it provides \
the possibility to edit files simultaneously with other users over \
a network. It supports multiple documents in one session. \
 \
This version of Gobby uses the Infinote protocol."
LICENSE = "GPL-2.0-or-later & ISC"

PV = "0.5.1+20180826.d16519e"

RPM_NAME = "gobby-0.5.1+20180826.d16519e-2.12.aarch64.rpm"
RPM_HASH = "ab5bcc75c0331badd57184573fdb8d9539aeacb2eb1c4437cd9e62c2e027b78b86e5f81a343a328c773fdbe39c34e13b73bb707c7d4ddc02d5d415c151cee0e0"

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
