SUMMARY = "Header files for lua54-lua-ev"
DESCRIPTION = "This subpackage contains header files for developing applications that \
want to make use of lua54-lua-ev."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "lua54-lua-ev-devel-1.5-4.3.aarch64.rpm"
RPM_HASH = "7d0a89841a3d51dd05853bfb5358f7fe55dfd50cbf54e0b03913f8aae8c368cb697fd0de9bb8a7994cc930f5d9dddf8873439468b89e517b6fbb13c3b2f97ce8"

RPROVIDES:${PN} += "lua54-lua-ev-devel"

RDEPENDS:${PN} += "lua54-lua-ev"

inherit rpm
