SUMMARY = "See tags stored on xattrs"
DESCRIPTION = "Caja-xattr-tags allows one to see tags stored on xattrs."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-xattr-tags-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "c7ca1124bc20ecd7579bbae1009bc3b7dbb1529d6087752905a8b0183e11172c2f4c9f95b0d39e2fbb271428640261b96b01b215f8fca728f1eb0a54bf54855a"

RPROVIDES:${PN} += "caja-extension-xattr-tags \
caja-extension-xattr-tags(aarch-64) \
libcaja-xattr-tags.so()(64bit)"

RDEPENDS:${PN} += "caja \
libc.so.6(GLIBC_2.17)(64bit) \
libcaja-extension.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
