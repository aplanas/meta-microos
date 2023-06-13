SUMMARY = "Header files for the user account information manipulation service"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information."
LICENSE = "GPL-3.0-or-later"

PV = "22.08.8"

RPM_NAME = "accountsservice-devel-22.08.8-2.4.aarch64.rpm"
RPM_HASH = "1dea4a76a941341d25da30d13ba00fb4a635102b952877fe77eb0cdba88e13f6b748ed41853c174043e14b6690157c96a70e37614c75ff7d51e0c713c7f2bb0d"

RPROVIDES:${PN} += "accountsservice-devel \
accountsservice-devel(aarch-64) \
pkgconfig(accountsservice)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaccountsservice0 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(polkit-gobject-1) \
typelib-1_0-AccountsService-1_0"

inherit rpm
