SUMMARY = "Lua bindings to GObject libraries - documentation and samples"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua51-lgi-doc-0.9.2-4.4.aarch64.rpm"
RPM_HASH = "2db32824ea7ee26218f96e744e0eb5f86a209ca48f4a303e1a63f523662b02ba6e9c5c64209f27f19182080234af459125299560f53561ba0a8cb1034b4de952"

RPROVIDES:${PN} += "lua51-lgi-doc"

RDEPENDS:${PN} += ""

inherit rpm
