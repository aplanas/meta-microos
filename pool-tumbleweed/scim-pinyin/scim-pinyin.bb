SUMMARY = "Smart pinyin IM engine for SCIM platform"
DESCRIPTION = "Smart pinyin IM engine for SCIM platform."
LICENSE = "GPL-2.0+"

PV = "0.5.92"

RPM_NAME = "scim-pinyin-0.5.92-8.32.aarch64.rpm"
RPM_HASH = "090e1e3da278c6cde87107ef3ff8456fed512ef55b085154e10e258e6637fa36ab5d98970dc381673068990c5de3679bc3a33f762063309db0c214266f7f6547"

RPROVIDES:${PN} += "scim-pinyin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libscim-1.0.so.8 \
libscim-gtkutils-1.0.so.8 \
libstdc++.so.6"

inherit rpm
