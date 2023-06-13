SUMMARY = "Lua-5.3-style APIs for Lua 5.2 and 5.1"
DESCRIPTION = "This package provides terminal operations for Lua"
LICENSE = "MIT"

PV = "0.10"

RPM_NAME = "lua53-compat-5.3-0.10-9.2.aarch64.rpm"
RPM_HASH = "9c8ed4ed1628f93bb74ffc9083e5e05d144f52a481b98b9a46680341913ba38deda99f39d5b63b30d6cf44675786f593ba6c6d747fb73270edb612f6584a17df"

RPROVIDES:${PN} += "lua53-compat-5.3 \
lua53-compat-5.3(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
lua53"

inherit rpm
