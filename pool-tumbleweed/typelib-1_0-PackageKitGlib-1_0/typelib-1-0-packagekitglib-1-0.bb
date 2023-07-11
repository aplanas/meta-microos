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

RPM_NAME = "typelib-1_0-PackageKitGlib-1_0-1.2.5-9.4.aarch64.rpm"
RPM_HASH = "1ffc26d9e2f3bd4e4740f3a2e0f7f7074f021a14336d08729e2364dc65ae4ee46867063841b1d2784a9c5735d722620dfd0c584b5b86f8761350bb681f79e687"

RPROVIDES:${PN} += "typelib-1-0-PackageKitGlib-1-0 \
typelib-PackageKitGlib"

RDEPENDS:${PN} += "libpackagekit-glib2.so.18 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
