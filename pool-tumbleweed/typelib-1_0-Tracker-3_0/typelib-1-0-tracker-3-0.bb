SUMMARY = "Introspection bindings for the Tracker Sparql library"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
This package provides the GObject Introspection bindings for the \
sparql library for Tracker."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.3"

RPM_NAME = "typelib-1_0-Tracker-3_0-3.5.3-1.1.aarch64.rpm"
RPM_HASH = "26dde279dee9dfa174d5b523e97eaa6ab27d9fbaa3f5dc8ac0c40b386997138b01cdc81b298b0b1fe43ccbdf1b15f64d07a745b3144d5064ea41a54de832fd19"

RPROVIDES:${PN} += "typelib-1-0-Tracker-3-0 \
typelib-Tracker"

RDEPENDS:${PN} += "libtracker-sparql-3.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
