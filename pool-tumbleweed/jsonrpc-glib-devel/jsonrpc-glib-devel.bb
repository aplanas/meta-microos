SUMMARY = "Development environment for jsonrpc-glib"
DESCRIPTION = "This is a library to communicate with JSON-RPC based peers in \
either a synchronous or an asynchronous fashion. It also allows \
communicating using the GVariant serialization format instead \
of JSON when both peers support it. \
 \
This package contains all files necessary for development using \
Jsonrpc-GLib."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "jsonrpc-glib-devel-3.44.0-1.2.aarch64.rpm"
RPM_HASH = "a93723a670dd365852e8ccf3cad1c4ec40a40a32fea50ba17cf296045941c25ba708b37257a305f1d24a7b43f1b2ac16a75c1c1481be557fa52ff275dbcf8359"

RPROVIDES:${PN} += "jsonrpc-glib-devel \
pkgconfig-jsonrpc-glib-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjsonrpc-glib-1-0-1 \
pkgconfig-gio-2.0 \
pkgconfig-json-glib-1.0 \
typelib-1-0-Jsonrpc-1-0"

inherit rpm
