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

RPROVIDES:${PN} += "application() \
application(gobby-0.5.desktop) \
gobby \
gobby(aarch-64) \
metainfo() \
metainfo(gobby-0.5.appdata.xml) \
mimehandler(text/plain) \
mimehandler(x-scheme-handler/infinote)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libatkmm-1.6.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-3.so.0()(64bit) \
libgdkmm-3.0.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libgiomm-2.4.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.4.so.1()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtkmm-3.0.so.1()(64bit) \
libgtksourceview-3.0.so.1()(64bit) \
libinfgtk-0.7.so.0()(64bit) \
libinfinity-0.7.so.0()(64bit) \
libinftext-0.7.so.0()(64bit) \
libinftextgtk-0.7.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpangomm-1.4.so.1()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libxml++-2.6.so.2()(64bit) \
update-alternatives"

inherit rpm
