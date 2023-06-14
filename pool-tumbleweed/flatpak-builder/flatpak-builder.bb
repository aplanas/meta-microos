SUMMARY = "Tool to build flatpaks from source"
DESCRIPTION = "Tool to build flatpaks from source. \
See https://docs.flatpak.org/ for more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.3"

RPM_NAME = "flatpak-builder-1.2.3-2.3.aarch64.rpm"
RPM_HASH = "03fc090bf10c908985dbf8da1a4315f684d4c244069f2eeb983cdfd01fd1fa3ddb1c2801effa9213b0991d8091da6ff82b14273acc8ba231883f2dbf966c893c"

RPROVIDES:${PN} += "flatpak-builder"

RDEPENDS:${PN} += "/usr/bin/bzip2 \
/usr/bin/eu-strip \
/usr/bin/git \
/usr/bin/patch \
/usr/bin/strip \
/usr/bin/tar \
/usr/bin/unzip \
debugedit \
flatpak \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libelf.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libostree-1.so.1 \
libsoup-2.4.so.1 \
libxml2.so.2 \
libyaml-0.so.2"

inherit rpm
