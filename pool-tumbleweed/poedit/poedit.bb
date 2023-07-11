SUMMARY = "Gettext Catalog Editing Tool"
DESCRIPTION = "Poedit is an editor for gettext catalogs (.po files). It is built \
with the wxWidgets toolkit, providing a graphical approach to \
editing catalogs over launching vi and editing the file by hand."
LICENSE = "MIT"

PV = "3.3.2"

RPM_NAME = "poedit-3.3.2-1.1.aarch64.rpm"
RPM_HASH = "7a3634b5b9630016922817d242ac1c0949c8619c89b4a2b128cfa8e728d5a177c526d1f9a459a26050221be77c73480c8020750b6f9e734518ff2e87ec91aeea"

RPROVIDES:${PN} += "poedit"

RDEPENDS:${PN} += "gettext-tools \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcld2.so.0 \
libcpprest.so.2.10 \
libcrypto.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtkspell3-3.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
liblucene++.so.0 \
libm.so.6 \
libpugixml.so.1 \
libsecret-1.so.0 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.9.0.0 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-webview-suse.so.9.0.0 \
libwx-gtk3u-xrc-suse.so.9.0.0"

inherit rpm
