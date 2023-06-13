SUMMARY = "Gobject introspection files for gsound"
DESCRIPTION = "GSound is a library for playing system sounds. \
It's designed to be used via GObject Introspection, \
and is a wrapper around the libcanberra C library."
LICENSE = "LGPL-2.1-only"

PV = "1.0.3"

RPM_NAME = "typelib-1_0-GSound-1_0-1.0.3-2.8.aarch64.rpm"
RPM_HASH = "e6a9e9326ffc89625cd7da9f3acb9e8c9cda77a0bf3c7d27fc79bea659d0572591fcb41d65a51e286a67e4d76606fbe9fb1fb52f33d04606dbcbd7873512bcd4"

RPROVIDES:${PN} += "typelib(GSound) \
typelib-1_0-GSound-1_0 \
typelib-1_0-GSound-1_0(aarch-64)"

RDEPENDS:${PN} += "libgsound.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
