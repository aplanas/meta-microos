SUMMARY = "Store and retrieve passwords"
DESCRIPTION = "Secret-tool is a command line tool that can be used to store and \
retrieve passwords."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.5"

RPM_NAME = "secret-tool-0.20.5-1.7.aarch64.rpm"
RPM_HASH = "808863922ecb88ce345845e4aec4ffc52b543f8294ba52610366b99016e61d753a6b06c5fca355c5c5208ad8d80f10b31f91be855fac36ad8e4003945965685b"

RPROVIDES:${PN} += "libsecret-tools \
secret-tool \
secret-tool(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsecret-1.so.0()(64bit)"

inherit rpm
