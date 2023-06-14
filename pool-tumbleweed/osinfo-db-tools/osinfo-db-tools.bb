SUMMARY = "Tools for managing the osinfo database"
DESCRIPTION = "This package provides tools for managing the osinfo database of \
information about operating systems for use with virtualization"
LICENSE = "LGPL-2.1+ & GPL-2.0+"

PV = "1.10.0"

RPM_NAME = "osinfo-db-tools-1.10.0-2.3.aarch64.rpm"
RPM_HASH = "a910923d198cb434fce9df6f25c4ad79ba33d97a1de4fa43fa7ca637f45f43fe0afee0925a5353c708ac45a593377abb07f7af38496ad8c509a8b465401266a2"

RPROVIDES:${PN} += "osinfo-db-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libsoup-2.4.so.1 \
libxml2.so.2"

inherit rpm
