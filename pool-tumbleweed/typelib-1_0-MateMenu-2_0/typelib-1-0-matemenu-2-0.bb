SUMMARY = "Introspection bindings for the MATE Desktop Menu"
DESCRIPTION = "The libmate-menu library implements the 'Desktop Menu Specification' \
from freedesktop.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "typelib-1_0-MateMenu-2_0-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "0784470ecb4c48db16273f1fd87e10cb7b84b1a83c6b6841d2f2b35e6d83715bc44ddd50059213b0ba8230e31b49f705bd905e40de937b817953dd080ba8acde"

RPROVIDES:${PN} += "typelib(MateMenu) \
typelib-1_0-MateMenu-2_0 \
typelib-1_0-MateMenu-2_0(aarch-64)"

RDEPENDS:${PN} += "libmate-menu.so.2()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
