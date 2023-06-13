SUMMARY = "A dictionary with word definitions"
DESCRIPTION = "palaura is a dictionary application featuring word definitions. \
It uses the Oxford Dictionaries API for lookups."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "palaura-1.5.1-1.12.aarch64.rpm"
RPM_HASH = "c27262abc2e2ba89564b38dcb7035fa01703fe2471071a7af832b7a2255828e71eca0574e4d4d17203e84b627f5ab22cdca69bbd527b4a055c50dcaee932d435"

RPROVIDES:${PN} += "application() \
application(com.github.lainsce.palaura.desktop) \
metainfo() \
metainfo(com.github.lainsce.palaura.appdata.xml) \
palaura \
palaura(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-3.0.so.1()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libsoup-2.4.so.1()(64bit)"

inherit rpm
