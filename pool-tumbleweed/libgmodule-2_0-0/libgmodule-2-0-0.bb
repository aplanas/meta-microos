SUMMARY = "General-Purpose Utility Library -- Library for Modules"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
The libgmodule library provides a portable way to dynamically load \
object files (commonly known as 'plug-ins')."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.5"

RPM_NAME = "libgmodule-2_0-0-2.76.5-1.1.aarch64.rpm"
RPM_HASH = "ab2f7ed06f3362afbce54dce624ac82d52c54f0b14356be64db1fe3f3b4cd258f899476c5cb640a4a60377c4adade56801f97896a6d19ba5f6a9de6eb6593c89"

RPROVIDES:${PN} += "libgmodule-2-0-0 \
libgmodule-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0"

inherit rpm
