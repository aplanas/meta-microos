SUMMARY = "Glib integration for DBus - development files"
DESCRIPTION = "This package provides glib integration for Mono.DBus - Development \
files."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "dbus-sharp-glib2-devel-0.6.0-2.8.noarch.rpm"
RPM_HASH = "069721f33f7aecd45236f4395dc7848c79833b30390324bff57ee1bd5b7a337b950356b1a07566f2846ffccb0001e7e0ae9c2d7a12270c28726397d1b096d4cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dbus-sharp-glib2-devel pkgconfig(dbus-sharp-glib-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config dbus-sharp-glib2 pkgconfig(dbus-sharp-2.0)"

inherit rpm
