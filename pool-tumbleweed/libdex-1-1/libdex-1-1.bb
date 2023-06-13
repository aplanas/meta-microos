SUMMARY = "Shared library for libdex"
DESCRIPTION = "Dex is a library supporting 'Deferred Execution' with the explicit \
goal of integrating with GNOME and GTK-based applications. \
It provides primatives for supporting futures in a variety of ways \
with both read-only and writable views. Additionally, integration \
with existing asynchronous-based APIs is provided through the use \
of wrapper promises. \
'Fibers' are implemented which allows for writing synchronous \
looking code which calls asynchronous APIs from GIO underneath. \
 \
This package contains the shared library for libdex."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.0"

RPM_NAME = "libdex-1-1-0.2.0-1.1.aarch64.rpm"
RPM_HASH = "d00689f36589fd17e2d31a9f28be3423cc77d93b342a6bf2c7421a9baefb71ae9b4f958f5ed9846a135335138000d6a6b89c6ee712b3abaf31167789752814d0"

RPROVIDES:${PN} += "libdex-1-1 \
libdex-1-1(aarch-64) \
libdex-1.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libatomic.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
liburing.so.2()(64bit)"

inherit rpm
