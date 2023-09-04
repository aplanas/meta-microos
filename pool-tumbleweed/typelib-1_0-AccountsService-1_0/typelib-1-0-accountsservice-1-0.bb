SUMMARY = "Introspection bindings for the user account information manipulation service"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
This package provides the GObject Introspection bindings for the \
client library."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "typelib-1_0-AccountsService-1_0-23.13.9-4.1.aarch64.rpm"
RPM_HASH = "40df8081d93e05ebdbdeafbd3773e00566e74eb4912ee588620bcc98fdc62a21574ad3b94be1be00ac01f75d08cf7451a39a7f894165779634d62d32122ab5df"

RPROVIDES:${PN} += "typelib-1-0-AccountsService-1-0 \
typelib-AccountsService"

RDEPENDS:${PN} += "libaccountsservice.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
