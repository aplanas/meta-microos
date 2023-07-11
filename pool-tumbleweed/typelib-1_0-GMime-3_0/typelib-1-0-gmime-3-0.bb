SUMMARY = "MIME Parser and Utility Library -- Introspection bindings"
DESCRIPTION = "GMime is a C/C++ library for parsing and creating messages using \
the Multipurpose Internet Mail Extension (MIME)."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.13"

RPM_NAME = "typelib-1_0-GMime-3_0-3.2.13-1.2.aarch64.rpm"
RPM_HASH = "93ed7963fc72cfbfa3ea4cba7ce01aefffc3ce45e96e72f4e0e9806c5dcd0a1f4bf1a423fb16d292945dadf5b53db4a4fdfddff436fae9a4793ecdd47b059138"

RPROVIDES:${PN} += "typelib-1-0-GMime-3-0 \
typelib-GMime"

RDEPENDS:${PN} += "libgmime-3.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
