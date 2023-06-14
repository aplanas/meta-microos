SUMMARY = "GObject Introspection interface description for libplayerctl"
DESCRIPTION = "This package provides the GObject Introspection bindings libplayerctl, \
enabling usage in programming languages that support it."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "typelib-1_0-Playerctl-2_0-2.4.1-1.8.aarch64.rpm"
RPM_HASH = "9067a13dff1032fb00caf3e3e559d30a151645cdef726a981ae96418b95dce5cb93f0af9bf71d37fc18813c387ac7f68fcdc7ef7e766792d8f2890891f9cfe40"

RPROVIDES:${PN} += "typelib-1-0-Playerctl-2-0 \
typelib-Playerctl"

RDEPENDS:${PN} += "libplayerctl.so.2 \
typelib-GLib \
typelib-GObject"

inherit rpm
