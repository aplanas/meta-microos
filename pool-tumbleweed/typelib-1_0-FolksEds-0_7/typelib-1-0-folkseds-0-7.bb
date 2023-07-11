SUMMARY = "Introspection bindings for libfolks-eds"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides the GObject Introspection bindings for libfolks."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "typelib-1_0-FolksEds-0_7-0.15.6-1.2.aarch64.rpm"
RPM_HASH = "b2dde0e2e43a168323885f05750370bfffbd5ae91344024c3449d382e2980f8d35f0c1017c409ebad54c953080a75d43b412d56c4a2a0336b9223cd29a088678"

RPROVIDES:${PN} += "typelib-1-0-FolksEds-0-7 \
typelib-FolksEds"

RDEPENDS:${PN} += "typelib-Camel \
typelib-EBookContacts \
typelib-EDataServer \
typelib-Folks \
typelib-GLib \
typelib-GObject \
typelib-Gee \
typelib-Gio \
typelib-Json \
typelib-Soup \
typelib-libxml2"

inherit rpm
