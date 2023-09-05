SUMMARY = "Tool to build flatpaks from source"
DESCRIPTION = "Tool to build flatpaks from source. \
See https://docs.flatpak.org/ for more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.3"

RPM_NAME = "flatpak-builder-1.2.3-3.1.aarch64.rpm"
RPM_HASH = "566f4b2972c1a73695f0da7bbdc624352fbc064e5e577db9bd65c00c82742cc4c76d14d4ed82516534c45db2c3123a77c1d3274f88e088474c6ef5503dbc4645"

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
