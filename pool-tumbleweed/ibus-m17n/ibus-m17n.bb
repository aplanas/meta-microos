SUMMARY = "The M17N engine for IBus platform"
DESCRIPTION = "M17N engine for IBus input platform. It allows input of many languages using \
the input table maps from m17n-db."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.19"

RPM_NAME = "ibus-m17n-1.4.19-1.3.aarch64.rpm"
RPM_HASH = "0e769343134f4034c7c7bb3dff9ba11eb628dcb7a64438d0a64de8dbb488006857c72ad479dcf30b4b37a0b880d62c3ec40a87527f18aeecd53db8364131d173"

RPROVIDES:${PN} += "application() \
application(ibus-setup-m17n.desktop) \
ibus-m17n \
ibus-m17n(aarch-64) \
locale(ibus:am;ar;as;bn;fa;gu;he;hi;ja;ka;kk;kn;ko;lo;ml;my;ur;ru;vi;zh) \
metainfo() \
metainfo(m17n.appdata.xml)"
RDEPENDS:${PN} += "ibus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libibus-1.0.so.5()(64bit) \
libm17n-core.so.0()(64bit) \
libm17n.so.0()(64bit)"

inherit rpm
