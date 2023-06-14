SUMMARY = "Lua bindings to GObject libraries - documentation and samples"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua51-lgi-doc-0.9.2-4.3.aarch64.rpm"
RPM_HASH = "64f1e365f3f49f60990fce3e2a7c3a359baab0c73f68d1dd2cee45b8d8f1ae55ff07a574318e3ca84db85d1c681c5bef39d8b504d51869eae4cbc0d958a29cd8"

RPROVIDES:${PN} += "lua51-lgi-doc"

RDEPENDS:${PN} += ""

inherit rpm
