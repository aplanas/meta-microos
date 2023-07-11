SUMMARY = "Development files for uhttpmock"
DESCRIPTION = "This package contains libraries, header files and documentation for \
developing applications that use uhttpmock."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.0"

RPM_NAME = "uhttpmock-devel-0.9.0-1.4.aarch64.rpm"
RPM_HASH = "bb7f11279729e7915564279c1d248f6793fcb29a52b1c6883a5f9c4d64988e022fab07bc7170971c535ebdbedbfa2a17922ecffcbc3be17231c9ffda1dd6165e"

RPROVIDES:${PN} += "pkgconfig-libuhttpmock-1.0 \
uhttpmock-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuhttpmock-1-0-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-libsoup-3.0 \
typelib-1-0-Uhm-1-0"

inherit rpm
