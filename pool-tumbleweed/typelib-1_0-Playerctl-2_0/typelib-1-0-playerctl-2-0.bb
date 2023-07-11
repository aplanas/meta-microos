SUMMARY = "GObject Introspection interface description for libplayerctl"
DESCRIPTION = "This package provides the GObject Introspection bindings libplayerctl, \
enabling usage in programming languages that support it."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "typelib-1_0-Playerctl-2_0-2.4.1-1.9.aarch64.rpm"
RPM_HASH = "1a527b3ea20bee9b570c2f02c964818d6fea3b96431db46e3309b509357644ccd39d875f4a42a26ab50e76e1321d1fc2439017c769d91463f8a52d042b3e7f4a"

RPROVIDES:${PN} += "typelib-1-0-Playerctl-2-0 \
typelib-Playerctl"

RDEPENDS:${PN} += "libplayerctl.so.2 \
typelib-GLib \
typelib-GObject"

inherit rpm
