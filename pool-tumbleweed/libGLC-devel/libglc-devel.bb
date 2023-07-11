SUMMARY = "QuesoGLC Development Files"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications using QuesoGLC."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libGLC-devel-0.7.2-3.7.aarch64.rpm"
RPM_HASH = "8c8ee6271be4328979837709bf84ca7013a99eb02eac61f9577c736992ccd10b6715905e7d160b649f76e37ee87d65452ca2235f75e12422621bf2de63a3206c"

RPROVIDES:${PN} += "libGLC-devel \
pkgconfig-quesoglc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-devel \
libGLC0 \
pkgconfig-expat \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-fribidi \
pkgconfig-zlib"

inherit rpm
