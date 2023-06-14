SUMMARY = "Nautilus ACL viewer and editor extension"
DESCRIPTION = "A Nautilus extension that allows viewing and editing ACL permissions."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.0.rc2"

RPM_NAME = "nautilus-eiciel-0.10.0.rc2-1.3.aarch64.rpm"
RPM_HASH = "37e8fed40a455c44a9982ea96d31e8f26c9cd40aff2646c087acbb3326b58b8150924a973fda40f7440e8fe8f8e68cd1cf5fa86e9d7f037af14c78520585ea33"

RPROVIDES:${PN} += "libeiciel-nautilus.so \
nautilus-eiciel"

RDEPENDS:${PN} += "eiciel \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libnautilus-extension.so.4 \
libstdc++.so.6"

inherit rpm
