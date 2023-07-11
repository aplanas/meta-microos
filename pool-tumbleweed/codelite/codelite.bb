SUMMARY = "Code editor for C, C++, PHP and Node.js"
DESCRIPTION = "CodeLite is a code editor for the C, C++, PHP and Node.js programming languages. \
It uses an interface with which users can create, build and debug projects."
LICENSE = "GPL-3.0-only"

PV = "16.0.0"

RPM_NAME = "codelite-16.0.0-2.6.aarch64.rpm"
RPM_HASH = "f287c157fce3499313b65dafcc0509cfc428d91d90d7d6f3710aa4349996c2a0d5c02f391ac1d2aed57a1e0afa472d61e329c1498fb9b4b8c2553831c4e35b8d"

RPROVIDES:${PN} += "codelite \
libdatabaselayersqlite.so \
liblibcodelite.so \
libplugin.so \
libwxshapeframework.so \
libwxsqlite3.so"

RDEPENDS:${PN} += "/usr/bin/node \
/usr/bin/python3 \
/usr/bin/sh \
ctags \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libhunspell-1.7.so.0 \
libm.so.6 \
libsqlite3.so.0 \
libssh.so.4 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.9.0.0 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk3u-aui-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-html-suse.so.9.0.0 \
libwx-gtk3u-propgrid-suse.so.9.0.0 \
libwx-gtk3u-ribbon-suse.so.9.0.0 \
libwx-gtk3u-richtext-suse.so.9.0.0 \
libwx-gtk3u-stc-suse.so.9.0.0 \
libwx-gtk3u-xrc-suse.so.9.0.0 \
xterm-bin"

inherit rpm
