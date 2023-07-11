SUMMARY = "JSON-RPC based peers lib -- Introspection bindings"
DESCRIPTION = "This is a library to communicate with JSON-RPC based peers in \
either a synchronous or an asynchronous fashion. It also allows \
communicating using the GVariant serialization format instead \
of JSON when both peers support it. \
 \
This package contains the Jsonrpc-GLib introspection bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "typelib-1_0-Jsonrpc-1_0-3.44.0-1.2.aarch64.rpm"
RPM_HASH = "679c582e0e47e4494c91152f2dd534577059e508ccc0e8fcd8267bbd5ba9f571b5bf7c4be1512e1124016afb53b7080cc6f0a55887e647d29caef48fe83c03dc"

RPROVIDES:${PN} += "typelib-1-0-Jsonrpc-1-0 \
typelib-Jsonrpc"

RDEPENDS:${PN} += "libjsonrpc-glib-1.0.so.1 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
