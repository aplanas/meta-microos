SUMMARY = "Introspection bindings for the UDisks Client Library version 2"
DESCRIPTION = "UDisks provides a daemon, D-Bus API and command line tools \
for managing disks and storage devices. \
 \
This package provides the GObject Introspection bindings for \
the UDisks client library."
LICENSE = "LGPL-2.0-or-later"

PV = "2.9.4"

RPM_NAME = "typelib-1_0-UDisks-2_0-2.9.4-6.4.aarch64.rpm"
RPM_HASH = "37923085e68161f9fb867a05dd1d0bbb06dde2586899fc163395854134509138fee9819062482ceec2eeaac649f95b827e210468a156c910907c48e4b23a3b56"

RPROVIDES:${PN} += "typelib-1-0-UDisks-2-0 \
typelib-UDisks"

RDEPENDS:${PN} += "libudisks2.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
