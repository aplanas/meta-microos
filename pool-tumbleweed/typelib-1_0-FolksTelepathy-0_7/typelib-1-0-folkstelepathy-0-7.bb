SUMMARY = "Introspection bindings for libfolks-telepathy"
DESCRIPTION = "libfolks is a library that aggregates people from multiple sources (e.g. \
Telepathy connection managers) to create metacontacts. \
 \
This package provides the GObject Introspection bindings for libfolks."
LICENSE = "LGPL-2.1-or-later"

PV = "0.15.6"

RPM_NAME = "typelib-1_0-FolksTelepathy-0_7-0.15.6-1.2.aarch64.rpm"
RPM_HASH = "bcd1fbcf2a6183ba72c104a7eaeee2fdb06a93e25eba26f7bdabb7a027a0d3f2526d47d8b558ac537132c24efc8bd07b974eda85bcaf480bbcb3e8e9def0a640"

RPROVIDES:${PN} += "typelib-1-0-FolksTelepathy-0-7 \
typelib-FolksTelepathy"

RDEPENDS:${PN} += "typelib-Folks \
typelib-GLib \
typelib-GObject \
typelib-Gee \
typelib-Gio \
typelib-TelepathyGLib"

inherit rpm
