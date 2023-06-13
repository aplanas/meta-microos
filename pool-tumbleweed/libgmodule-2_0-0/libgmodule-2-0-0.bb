SUMMARY = "General-Purpose Utility Library -- Library for Modules"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The libgmodule library provides a portable way to dynamically load \
object files (commonly known as 'plug-ins')."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.3"

RPM_NAME = "libgmodule-2_0-0-2.76.3-1.1.aarch64.rpm"
RPM_HASH = "841ee86bbe5c3d183b10cdf97e458917334dfbd62b78d647a6e27ba44e2feeb0dc4856fe9305f05404819532799c24cb5d018e75052a3fb08160d92257c3708c"

RPROVIDES:${PN} += "libgmodule-2.0.so.0()(64bit) \
libgmodule-2_0-0 \
libgmodule-2_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
