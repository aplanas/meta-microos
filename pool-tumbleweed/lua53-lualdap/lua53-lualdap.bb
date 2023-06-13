SUMMARY = "Lua binding to OpenLDAP"
DESCRIPTION = "LuaLDAP is a simple interface from Lua to an LDAP client, in fact it is a bind to OpenLDAP client or ADSI"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "lua53-lualdap-1.3.0-2.2.aarch64.rpm"
RPM_HASH = "92a3ed74d12ee4c25cf74cfbaa13e35a4830e666543a1ab8ce6192500f0c78f7f0f4e8804d812cb07c3838dc0ca95dbf17fd9f2965f451d15f612ba835119908"

RPROVIDES:${PN} += "lua53-lualdap \
lua53-lualdap(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
lua53"

inherit rpm
