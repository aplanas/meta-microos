SUMMARY = "Introspection bindings for the user account information manipulation service"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
This package provides the GObject Introspection bindings for the \
client library."
LICENSE = "GPL-3.0-or-later"

PV = "22.08.8"

RPM_NAME = "typelib-1_0-AccountsService-1_0-22.08.8-2.4.aarch64.rpm"
RPM_HASH = "1d5ca6af6004241139b6a11b5b6f136fdefdde7e70cd4f0832ed03a26002f0b1480466d5ef1a729be3aa6c61c7626ca1d03d0888c5fe008fa36fc87d79779368"

RPROVIDES:${PN} += "typelib(AccountsService) \
typelib-1_0-AccountsService-1_0 \
typelib-1_0-AccountsService-1_0(aarch-64)"

RDEPENDS:${PN} += "libaccountsservice.so.0()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
