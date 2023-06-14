SUMMARY = "Lua bindings to GObject libraries - documentation and samples"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua53-lgi-doc-0.9.2-4.3.aarch64.rpm"
RPM_HASH = "b578958d779d66c22a4ec5ec4ffa25dc5116697be89fff6f8e5ccccf7c31755e4f1982f478696269d7387c72ffad6f245e79b25ccbc20b14ab5c0f05150bfe8c"

RPROVIDES:${PN} += "lua53-lgi-doc"

RDEPENDS:${PN} += ""

inherit rpm
