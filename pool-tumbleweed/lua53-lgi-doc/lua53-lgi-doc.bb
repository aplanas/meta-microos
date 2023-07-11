SUMMARY = "Lua bindings to GObject libraries - documentation and samples"
DESCRIPTION = "Dynamic Lua binding to any library which is introspectable \
using gobject-introspection. Allows using GObject-based libraries \
directly from Lua."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "lua53-lgi-doc-0.9.2-4.4.aarch64.rpm"
RPM_HASH = "df1e81bb5ecae659879dd2c8a48d949c07668905b6a65e09fe7078054ba89d2410e5e4f6c49d2fa232ddb4a111af68d97eab889edc20e7ac7c87c6009f6e566a"

RPROVIDES:${PN} += "lua53-lgi-doc"

RDEPENDS:${PN} += ""

inherit rpm
