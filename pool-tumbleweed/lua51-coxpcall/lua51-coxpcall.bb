SUMMARY = "Coroutine safe xpcall and pcall"
DESCRIPTION = "Encapsulates the protected calls with a coroutine based loop, so errors \
can be handled without the usual Lua 5.x pcall/xpcall issues with \
coroutines yielding inside the call to pcall or xpcall."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "lua51-coxpcall-1.17.0-4.1.noarch.rpm"
RPM_HASH = "9fe0230f77e67eb590ceca88ab63362f1d8b609c3acc23570efb0f7b5dd599b5a137b9bd68132ee79b06a3df75ee5e2fa149c784c608ce5e756f9b016405bfd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-coxpcall"

RDEPENDS:${PN} += "lua51"

inherit rpm
