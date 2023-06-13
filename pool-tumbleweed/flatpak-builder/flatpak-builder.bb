SUMMARY = "Tool to build flatpaks from source"
DESCRIPTION = "Tool to build flatpaks from source. \
See https://docs.flatpak.org/ for more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.3"

RPM_NAME = "flatpak-builder-1.2.3-2.3.aarch64.rpm"
RPM_HASH = "03fc090bf10c908985dbf8da1a4315f684d4c244069f2eeb983cdfd01fd1fa3ddb1c2801effa9213b0991d8091da6ff82b14273acc8ba231883f2dbf966c893c"

RPROVIDES:${PN} += "flatpak-builder \
flatpak-builder(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/bzip2 \
/usr/bin/eu-strip \
/usr/bin/git \
/usr/bin/patch \
/usr/bin/strip \
/usr/bin/tar \
/usr/bin/unzip \
debugedit \
flatpak \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libostree-1.so.1()(64bit) \
libostree-1.so.1(LIBOSTREE_2016.3)(64bit) \
libostree-1.so.1(LIBOSTREE_2016.8)(64bit) \
libostree-1.so.1(LIBOSTREE_2018.6)(64bit) \
libsoup-2.4.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libyaml-0.so.2()(64bit)"

inherit rpm
