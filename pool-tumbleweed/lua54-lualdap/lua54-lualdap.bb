SUMMARY = "Lua binding to OpenLDAP"
DESCRIPTION = "LuaLDAP is a simple interface from Lua to an LDAP client, in fact it is a bind to OpenLDAP client or ADSI"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "lua54-lualdap-1.3.0-2.2.aarch64.rpm"
RPM_HASH = "ce2413e6a37c13724362cf895b3b882942d30aba06decc3c1e2af68fb51277d030806ee9ef0f099c1655d71ddbf752953103c80ef357120dc52ddbc7f9081c41"

RPROVIDES:${PN} += "lua-lualdap \
lua54-lualdap \
lua54-lualdap(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
lua54"

inherit rpm
