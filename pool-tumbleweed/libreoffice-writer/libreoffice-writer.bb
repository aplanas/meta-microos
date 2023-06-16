SUMMARY = "LibreOffice Writer and Web"
DESCRIPTION = "This module allows you to create and edit text and graphics in letters, \
reports, documents and Web pages by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-writer-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "946aa5ccf4aaadcc15546db08264335421e5593f6cc4b14ebb34fbcd565b76d6241b4dd0471a30f16e66201cbfaaff1dd2fa8bfba86e3bcb05278e436878197f"

RPROVIDES:${PN} += "libhwplo.so \
liblwpftlo.so \
libmswordlo.so \
libreoffice-writer \
libswdlo.so \
libswuilo.so \
libt602filterlo.so \
libvbaswobjlo.so \
libwpftwriterlo.so \
libwriterfilterlo.so \
libwriterlo.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libabw-0.1.so.1 \
libc.so.6 \
libcuilo.so \
libe-book-0.1.so.1 \
libepubgen-0.1.so.1 \
libetonyek-0.1.so.1 \
libfilelo.so \
libgcc-s.so.1 \
libi18nlangtag.so \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libmergedlo.so \
libmwaw-0.3.so.3 \
libodfgen-0.1.so.1 \
libooxlo.so \
libreoffice \
librevenge-0.0.so.0 \
libstaroffice-0.0.so.0 \
libstdc++.so.6 \
libswlo.so \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
libwpd-0.10.so.10 \
libwpg-0.3.so.3 \
libwps-0.4.so.4 \
libwriterperfectlo.so \
libz.so.1 \
rtld-GNU-HASH"

inherit rpm
