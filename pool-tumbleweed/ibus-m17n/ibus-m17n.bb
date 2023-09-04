SUMMARY = "The M17N engine for IBus platform"
DESCRIPTION = "M17N engine for IBus input platform. It allows input of many languages using \
the input table maps from m17n-db."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.20"

RPM_NAME = "ibus-m17n-1.4.20-1.1.aarch64.rpm"
RPM_HASH = "dbdbab43564d95787d69a3763cc6bc594831cd664dce4dd7ee2f33dc26600e31fab7d1410e47b888c89efb74a21b7e918b54d30e9a8ad0b0d649d0fbb156b7c0"

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
