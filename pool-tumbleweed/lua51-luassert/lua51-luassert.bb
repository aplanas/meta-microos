SUMMARY = "Lua Assertions Extension"
DESCRIPTION = "Adds a framework that allows registering new assertions without \
compromising builtin assertion functionality."
LICENSE = "MIT"

PV = "1.7.11"

RPM_NAME = "lua51-luassert-1.7.11-5.1.noarch.rpm"
RPM_HASH = "514a00ed164d4039bbcb5eaed7fe67dabe2aae53d4877a26705df9dff0a7a76bb0a288a550ade7e223663f0ea0da9fd619a6a74096143a1a78182ab2e44b8c10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua51-luassert"

RDEPENDS:${PN} += "lua51"

inherit rpm
