SUMMARY = "Tools for managing the osinfo database"
DESCRIPTION = "This package provides tools for managing the osinfo database of \
information about operating systems for use with virtualization"
LICENSE = "LGPL-2.1+ & GPL-2.0+"

PV = "1.10.0"

RPM_NAME = "osinfo-db-tools-1.10.0-2.3.aarch64.rpm"
RPM_HASH = "a910923d198cb434fce9df6f25c4ad79ba33d97a1de4fa43fa7ca637f45f43fe0afee0925a5353c708ac45a593377abb07f7af38496ad8c509a8b465401266a2"

RPROVIDES:${PN} += "osinfo-db-tools \
osinfo-db-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libsoup-2.4.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
