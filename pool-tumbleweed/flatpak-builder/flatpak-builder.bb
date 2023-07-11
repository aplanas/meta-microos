SUMMARY = "Tool to build flatpaks from source"
DESCRIPTION = "Tool to build flatpaks from source. \
See https://docs.flatpak.org/ for more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.3"

RPM_NAME = "flatpak-builder-1.2.3-2.4.aarch64.rpm"
RPM_HASH = "5378a48d0859d801982e7850cb38c42b1a74e22eb8c5a0e514b6453274804dd4ee3e5ea1258543081fa8580023cef562d3dbdc22c9bd69481164201f2037dc56"

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
