SUMMARY = "Devel files for libfm"
DESCRIPTION = "A glib/gio-based lib used to develop file managers providing some \
file management utilities and related-widgets missing in gtk+/glib."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "libfm-extra-devel-1.3.1-1.21.aarch64.rpm"
RPM_HASH = "a608fc24332477b1a22702f6e80b23aa0f2a3eae8259c499687e088783ea7e1679b9d8c81085ed1e7f2b809f77564248f431c94a7961f357dda9ca0d7e353886"

RPROVIDES:${PN} += "libfm-extra-devel \
pkgconfig-libfm-extra"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfm-extra4 \
pkg-config \
pkgconfig-glib-2.0"

inherit rpm
