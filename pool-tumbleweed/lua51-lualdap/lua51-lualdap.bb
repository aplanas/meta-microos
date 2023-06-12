SUMMARY = "Lua binding to OpenLDAP"
DESCRIPTION = "LuaLDAP is a simple interface from Lua to an LDAP client, in fact it is a bind to OpenLDAP client or ADSI"
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "lua51-lualdap-1.3.0-2.2.aarch64.rpm"
RPM_HASH = "bf61a7c5124dfdeb8ff602fef31a9aeba4b3906f43d5073c57cc78f0f5421fbc0c81e058a43672af353914fe1289cf3bb77e46be4d5764bd95d5398ce3955c03"

RPROVIDES:${PN} += "lua51-lualdap \
lua51-lualdap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
lua51"

inherit rpm
