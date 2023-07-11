SUMMARY = "LuaJIT bindings for the efl"
DESCRIPTION = "A set of efl bindings for the LuaJIT environment."
LICENSE = "LGPL-2.1-only"

PV = "1.26.3"

RPM_NAME = "elua-1.26.3-30.8.aarch64.rpm"
RPM_HASH = "064036b0963009bccdb7b690f62c68db86a75b32f15a152c2aeeabd737f57f05d4fddc030b09c0b8ddd00d4b3815f62618e345a072c7a715da073929d2c563c1"

RPROVIDES:${PN} += "elua"

RDEPENDS:${PN} += "efl"

inherit rpm
