SUMMARY = "Introspection bindings for PackageKit's GLib integration"
DESCRIPTION = "PackageKit is a system designed to make installing and updating \
software on your computer easier.  The primary design goal is to unify \
all the software graphical tools used in different distributions, and \
use some of the latest technology like PolicyKit to make the process \
suck less. \
 \
This package provides the GObject Introspection bindings for the \
PackageKit client library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.5"

RPM_NAME = "typelib-1_0-PackageKitGlib-1_0-1.2.5-9.3.aarch64.rpm"
RPM_HASH = "56b1b5b4dd7b8eb35bf314f59ae0555b202792fee0de7ad89d59c27f50816436643c54ca68885c967da4f74d0bf0cde49c34bc322675a103dd741fae378a3264"

RPROVIDES:${PN} += "typelib(PackageKitGlib) \
typelib-1_0-PackageKitGlib-1_0 \
typelib-1_0-PackageKitGlib-1_0(aarch-64)"
RDEPENDS:${PN} += "libpackagekit-glib2.so.18()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
