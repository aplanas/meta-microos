SUMMARY = "Development files for feedbackd"
DESCRIPTION = "The feedbackd-devel package contains libraries and header files for \
developing applications that use feedbackd."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.1.0"

RPM_NAME = "feedbackd-devel-0.1.0-2.3.aarch64.rpm"
RPM_HASH = "28e71256b8a8604e5513784863e96d6119182f873dd54a8303853ce72f4c4b6f8d98622e473f5e4b9481a5bf0f15e2bd797ee1f69cf66c5b2c7f944e1e73c2d4"

RPROVIDES:${PN} += "feedbackd-devel \
pkgconfig-libfeedback-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
feedbackd \
libfeedback-0-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
typelib-1-0-Lfb-0-0"

inherit rpm
