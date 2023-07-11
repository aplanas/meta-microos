SUMMARY = "Introspection bindings for the user account information manipulation service"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
This package provides the GObject Introspection bindings for the \
client library."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "typelib-1_0-AccountsService-1_0-23.13.9-3.1.aarch64.rpm"
RPM_HASH = "16d71ed72ebb3bb77a0f9c88c6df011aeb0fc7b28ca6a9b89e8b16315ab7f289317500a449a28c89257010436892f72c6dba58eff7a74e973d1002f9e1b48bab"

RPROVIDES:${PN} += "typelib-1-0-AccountsService-1-0 \
typelib-AccountsService"

RDEPENDS:${PN} += "libaccountsservice.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
