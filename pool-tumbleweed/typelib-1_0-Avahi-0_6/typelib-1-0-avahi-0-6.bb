SUMMARY = "Introspection bindings for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing. \
 \
This package provides the GObject Introspection bindings for Avahi."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "typelib-1_0-Avahi-0_6-0.8-23.1.aarch64.rpm"
RPM_HASH = "a8ecc30e9f9ae9aa3c27d6bc9ce2f9c141da4a3bd8f466248f3c4253d44d51445ea7ac0e8515ff879a52261eefb1b5086b4802f53eeca3f891720d3e88f5390d"

RPROVIDES:${PN} += "typelib(Avahi) \
typelib(AvahiCore) \
typelib-1_0-Avahi-0_6 \
typelib-1_0-Avahi-0_6(aarch-64)"
RDEPENDS:${PN} += "libavahi-core.so.7()(64bit) \
libavahi-gobject.so.0()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
