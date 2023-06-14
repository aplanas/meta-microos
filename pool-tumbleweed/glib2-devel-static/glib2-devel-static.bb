SUMMARY = "Static libraries for glib, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
This package contains static versions of the GLib libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.3"

RPM_NAME = "glib2-devel-static-2.76.3-1.1.aarch64.rpm"
RPM_HASH = "76e17075439e5dc8b82b51fb46c41a477529240acf2a903b27bb6361c1d2473a9067b407564d2c5c8d83e9a4a8ad34298291254a603493f8857a40d3c90d38ad"

RPROVIDES:${PN} += "glib2-devel-static"

RDEPENDS:${PN} += "glib2-devel"

inherit rpm
