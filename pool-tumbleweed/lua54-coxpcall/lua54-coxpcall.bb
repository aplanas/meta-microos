SUMMARY = "Coroutine safe xpcall and pcall"
DESCRIPTION = "Encapsulates the protected calls with a coroutine based loop, so errors \
can be handled without the usual Lua 5.x pcall/xpcall issues with \
coroutines yielding inside the call to pcall or xpcall."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "lua54-coxpcall-1.17.0-4.1.noarch.rpm"
RPM_HASH = "ce0a0931141919222a03029b2c387268c2ad329fd4e26cd32e03c6efa10b301d1ca2d4e644e0d320063453b85c271aa83e32e1d2eef063115056308b0a416da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-coxpcall \
lua54-coxpcall"
RDEPENDS:${PN} += "lua54"

inherit rpm
