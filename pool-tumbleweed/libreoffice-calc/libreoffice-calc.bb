SUMMARY = "LibreOffice Calc"
DESCRIPTION = "This module allows you to perform calculation, analyze information and \
manage lists in spreadsheets by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-calc-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "ed502b358db3bc145653e3c3a1e0c8c5bf039dcf82dfb78a35a40d05efc7ac9dccad3cc02a3888a5a11c4d514646efd0bb32bdf77b8aef665f43b5913f1eb3b0"

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
liborcus-0.17.so.0 \
liborcus-parser-0.17.so.0 \
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
