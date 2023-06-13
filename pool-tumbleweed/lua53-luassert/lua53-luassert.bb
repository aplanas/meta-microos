SUMMARY = "Lua Assertions Extension"
DESCRIPTION = "Adds a framework that allows registering new assertions without \
compromising builtin assertion functionality."
LICENSE = "MIT"

PV = "1.7.11"

RPM_NAME = "lua53-luassert-1.7.11-5.1.noarch.rpm"
RPM_HASH = "2ba26e185ceea86493fa16b42ce6869283e9ef3a025b5ae240bd823f488e227eb065f78c05d751cf186ebd0c76d9fa4ba66f1ab7e02468191529f0156bf12dc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-luassert"

RDEPENDS:${PN} += "lua53"

inherit rpm
