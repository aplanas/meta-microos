SUMMARY = "Development files for feedbackd"
DESCRIPTION = "The feedbackd-devel package contains libraries and header files for \
developing applications that use feedbackd."
LICENSE = "GPL-3.0-only & LGPL-2.1-only"

PV = "0.1.0"

RPM_NAME = "feedbackd-devel-0.1.0-2.2.aarch64.rpm"
RPM_HASH = "7f6b054b28da5da835563338205ba0c47b4bfadbea7eeffb8cfcc7c63a5fa50a662884568ca6401fc5b94fbd6a9ef6a1fc3c6308eb68609a61fb68531d88c674"

RPROVIDES:${PN} += "feedbackd-devel feedbackd-devel(aarch-64) pkgconfig(libfeedback-0.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config feedbackd libfeedback-0_0-0 pkgconfig(gio-2.0) pkgconfig(gio-unix-2.0) pkgconfig(glib-2.0) typelib-1_0-Lfb-0_0"

inherit rpm
