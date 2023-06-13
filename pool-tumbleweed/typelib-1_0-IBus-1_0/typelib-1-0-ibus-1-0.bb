SUMMARY = "Introspection bindings for IBus"
DESCRIPTION = "This package contains the introspection bindings for the IBus library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.28"

RPM_NAME = "typelib-1_0-IBus-1_0-1.5.28-2.1.aarch64.rpm"
RPM_HASH = "22799233797d535e19cff32c3c262b0076a323f2b48f3a072113636fa0a6ffba2f715c0fa482672a98291676d9e85ddf321d4d35baf1c91e148aa6e89f37661e"

RPROVIDES:${PN} += "typelib(IBus) \
typelib-1_0-IBus-1_0 \
typelib-1_0-IBus-1_0(aarch-64)"

RDEPENDS:${PN} += "libibus-1.0.so.5()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
