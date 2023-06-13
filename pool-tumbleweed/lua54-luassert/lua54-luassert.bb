SUMMARY = "Lua Assertions Extension"
DESCRIPTION = "Adds a framework that allows registering new assertions without \
compromising builtin assertion functionality."
LICENSE = "MIT"

PV = "1.7.11"

RPM_NAME = "lua54-luassert-1.7.11-5.1.noarch.rpm"
RPM_HASH = "c7ad16a2e11101dcd3fbb9320e6a861574e1a4cc7fa9d5b42607f2b028dc468a7122f065092775a731ed26c7f1e510b85ef9ea534d9d7a9063d9399a40df99ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-luassert \
lua54-luassert"

RDEPENDS:${PN} += "lua54"

inherit rpm
