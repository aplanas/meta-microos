SUMMARY = "Code editor for C, C++, PHP and Node.js"
DESCRIPTION = "CodeLite is a code editor for the C, C++, PHP and Node.js programming languages. \
It uses an interface with which users can create, build and debug projects."
LICENSE = "GPL-3.0-only"

PV = "16.0.0"

RPM_NAME = "codelite-16.0.0-2.5.aarch64.rpm"
RPM_HASH = "cf83e6dee3f2932a13aee5f6ec51a3b44b21ce1f00f2b59af97df8e6de1100d507cb1691a07f02dd8aa8ddcca45ef09727fca9f9578172947e77e19617da65b2"

RPROVIDES:${PN} += "application() \
application(codelite.desktop) \
codelite \
codelite(aarch-64) \
libdatabaselayersqlite.so()(64bit) \
liblibcodelite.so()(64bit) \
libplugin.so()(64bit) \
libwxshapeframework.so()(64bit) \
libwxsqlite3.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/node \
/usr/bin/python3 \
ctags \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libhunspell-1.7.so.0()(64bit) \
libm.so.6()(64bit) \
libsqlite3.so.0()(64bit) \
libssh.so.4()(64bit) \
libssh.so.4(LIBSSH_4_5_0)(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu_net-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_gtk3u_aui-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_html-suse.so.9.0.0()(64bit) \
libwx_gtk3u_propgrid-suse.so.9.0.0()(64bit) \
libwx_gtk3u_ribbon-suse.so.9.0.0()(64bit) \
libwx_gtk3u_richtext-suse.so.9.0.0()(64bit) \
libwx_gtk3u_stc-suse.so.9.0.0()(64bit) \
libwx_gtk3u_xrc-suse.so.9.0.0()(64bit) \
xterm-bin"

inherit rpm
