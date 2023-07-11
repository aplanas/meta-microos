SUMMARY = "Lua bindings to GObject libraries - documentation and samples"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua54-lgi-doc-0.9.2-4.4.aarch64.rpm"
RPM_HASH = "aae33d95783afc87deb5f31e3cf0387b9d01a7148789a587a68ff83f7396356b03f57adfa97b0f6b32a719116f785561e48baa06a10d33bb4e6241b6b3862f05"

RPROVIDES:${PN} += "lua54-lgi-doc"

RDEPENDS:${PN} += ""

inherit rpm
