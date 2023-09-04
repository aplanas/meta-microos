SUMMARY = "LibreOffice Calc"
DESCRIPTION = "This module allows you to perform calculation, analyze information and \
manage lists in spreadsheets by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-calc-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "0da6e1e677205372029decd631679e0d4fcd5fc91be53a9f55324f92cd86c010f0e5bbdbcd7df99baf37a02a222ee33e73648f64ae482fcf744de7e7888c1d6f"

RPROVIDES:${PN} += "libanalysislo.so \
libcalclo.so \
libdatelo.so \
libpricinglo.so \
libreoffice-calc \
libscdlo.so \
libscfiltlo.so \
libsclo.so \
libscuilo.so \
libsolverlo.so \
libvbaobjlo.so \
libwpftcalclo.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclewlo.so \
libetonyek-0.1.so.1 \
libfilelo.so \
libgcc-s.so.1 \
libi18nlangtag.so \
libicui18n.so.73 \
libicuuc.so.73 \
liblpsolve55.so.0 \
libm.so.6 \
libmergedlo.so \
libmwaw-0.3.so.3 \
libodfgen-0.1.so.1 \
libooxlo.so \
liborcus-0.18.so.0 \
liborcus-parser-0.18.so.0 \
libreoffice \
librevenge-0.0.so.0 \
libstaroffice-0.0.so.0 \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
libwps-0.4.so.4 \
libwriterperfectlo.so \
libxml2.so.2 \
rtld-GNU-HASH"

inherit rpm
