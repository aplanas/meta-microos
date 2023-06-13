SUMMARY = "Lua string hashing library, useful for internationalization"
DESCRIPTION = "Useful for internationalization."
LICENSE = "MIT"

PV = "1.31"

RPM_NAME = "lua51-say-1.31-5.1.noarch.rpm"
RPM_HASH = "22d08085f584ac0d7b5596785e32b89c7e66fc24337b40326f0378a72b15891468ea0f5c93e4782ba8be2fbf287b1c6ac7103f9a6cf85a3d07df4a551d4ef4a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-say"

RDEPENDS:${PN} += "lua51"

inherit rpm
