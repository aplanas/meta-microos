SUMMARY = "This is a binding to libunbound for Lua"
DESCRIPTION = "This is a binding to libunbound for Lua"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "lua51-luaunbound-1.0.0-1.6.aarch64.rpm"
RPM_HASH = "04ccb16e827514c415f5fe23afe449d672821606a8a2468bd4e363241e6b0eb6f898fbbd73fca63485928debffb38ab03b255a62862e63f327a929cf90c9934f"

RPROVIDES:${PN} += "lua51-luaunbound"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.1.so.5 \
libunbound.so.8"

inherit rpm
