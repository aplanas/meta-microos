SUMMARY = "The M17N engine for IBus platform"
DESCRIPTION = "M17N engine for IBus input platform. It allows input of many languages using \
the input table maps from m17n-db."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.19"

RPM_NAME = "ibus-m17n-1.4.19-1.3.aarch64.rpm"
RPM_HASH = "0e769343134f4034c7c7bb3dff9ba11eb628dcb7a64438d0a64de8dbb488006857c72ad479dcf30b4b37a0b880d62c3ec40a87527f18aeecd53db8364131d173"

RPROVIDES:${PN} += "ibus-m17n \
locale-ibus-am;ar;as;bn;fa;gu;he;hi;ja;ka;kk;kn;ko;lo;ml;my;ur;ru;vi;zh"

RDEPENDS:${PN} += "ibus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libibus-1.0.so.5 \
libm17n-core.so.0 \
libm17n.so.0"

inherit rpm
