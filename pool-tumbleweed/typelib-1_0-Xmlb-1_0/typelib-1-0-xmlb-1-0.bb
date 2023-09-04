SUMMARY = "Introspection bindings for libxmlb"
DESCRIPTION = "This package provides the GObject Introspection bindings for \
libxmlb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.13"

RPM_NAME = "typelib-1_0-Xmlb-1_0-0.3.13-1.1.aarch64.rpm"
RPM_HASH = "c1f6ee9188a0ec53a72a582c053340d7222114cc31cdf4f32eafb484dcfa4df0e66dbe111ed24b10a0f8a61b9b711b41658156c458e49c0da9d96fa9d0848e24"

RPROVIDES:${PN} += "typelib-1-0-Xmlb-1-0 \
typelib-Xmlb"

RDEPENDS:${PN} += "libxmlb.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
