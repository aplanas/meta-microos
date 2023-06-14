SUMMARY = "Development files for libayatana-appindicator"
DESCRIPTION = "This package contains the development files for the ayatana \
appindicator library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.91"

RPM_NAME = "libayatana-appindicator-devel-0.5.91-1.4.aarch64.rpm"
RPM_HASH = "729c28991eb7c24b6f5b5495d164f2cc5af7386425f039ceba79651607637f4727162b262962df4ca38943c6d66e5a5ed15293bac46f8b40eb1d92fc2698d7bb"

RPROVIDES:${PN} += "libayatana-appindicator-devel \
pkgconfig-ayatana-appindicator-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libayatana-appindicator1 \
pkgconfig-ayatana-indicator-0.4 \
pkgconfig-dbusmenu-glib-0.4 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-2.0"

inherit rpm
