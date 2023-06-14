SUMMARY = "Code editor for C, C++, PHP and Node.js"
DESCRIPTION = "CodeLite is a code editor for the C, C++, PHP and Node.js programming languages. \
It uses an interface with which users can create, build and debug projects."
LICENSE = "GPL-3.0-only"

PV = "16.0.0"

RPM_NAME = "codelite-16.0.0-2.5.aarch64.rpm"
RPM_HASH = "cf83e6dee3f2932a13aee5f6ec51a3b44b21ce1f00f2b59af97df8e6de1100d507cb1691a07f02dd8aa8ddcca45ef09727fca9f9578172947e77e19617da65b2"

RPROVIDES:${PN} += "codelite \
libdatabaselayersqlite.so \
liblibcodelite.so \
libplugin.so \
libwxshapeframework.so \
libwxsqlite3.so"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/node \
/usr/bin/python3 \
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
