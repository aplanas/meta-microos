SUMMARY = "Static libraries for glib, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
This package contains static versions of the GLib libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.5"

RPM_NAME = "glib2-devel-static-2.76.5-1.1.aarch64.rpm"
RPM_HASH = "6fd76840f91f45812937cad51b4a2c740f287e60b373cb3fa02ecfcdec54e07e523091c22fa797844caafb06168596322073c39663ed925d4ceafd48585e3da2"

RPROVIDES:${PN} += "glib2-devel-static"

RDEPENDS:${PN} += "glib2-devel"

inherit rpm
