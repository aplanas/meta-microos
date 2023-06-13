SUMMARY = "Smart pinyin IM engine for SCIM platform"
DESCRIPTION = "Smart pinyin IM engine for SCIM platform."
LICENSE = "GPL-2.0+"

PV = "0.5.92"

RPM_NAME = "scim-pinyin-0.5.92-8.31.aarch64.rpm"
RPM_HASH = "eb5b88b034b24482b4d2e8f8a78a12ffcf5c1276e4dfaebe04944ac3b9913e52c3a201ac12fbe400f910cdabc44ae95cc297d50ab69e041f921c795d961553e7"

RPROVIDES:${PN} += "scim-pinyin \
scim-pinyin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libscim-1.0.so.8()(64bit) \
libscim-gtkutils-1.0.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
