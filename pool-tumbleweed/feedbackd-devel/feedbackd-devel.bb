SUMMARY = "Development files for feedbackd"
DESCRIPTION = "The feedbackd-devel package contains libraries and header files for \
developing applications that use feedbackd."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.2.1"

RPM_NAME = "feedbackd-devel-0.2.1-1.1.aarch64.rpm"
RPM_HASH = "43fcf7afada9448204cb2d6b59b751d780c7da82510ed73afd82cd8a186cc15af8e7672c9bacb99b8088a22b48e7703188b4169e97eaef86f583b15eb9a9207c"

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
