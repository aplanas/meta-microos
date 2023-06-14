SUMMARY = "Devel files for libfm"
DESCRIPTION = "A glib/gio-based lib used to develop file managers providing some \
file management utilities and related-widgets missing in gtk+/glib."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "libfm-extra-devel-1.3.1-1.20.aarch64.rpm"
RPM_HASH = "fb503140f0c6707303152150370468ef682c42cd0b8360254c70697f02610f77bbbfe09071dc4bd5de5b737f9b050cd731691e679d4c11e219ce2e029e8e9773"

RPROVIDES:${PN} += "libfm-extra-devel \
pkgconfig-libfm-extra"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfm-extra4 \
pkgconf-pkg-config \
pkgconfig-glib-2.0"

inherit rpm
