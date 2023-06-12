SUMMARY = "The vim-like browser"
DESCRIPTION = "vimb is a WebKit-based web browser that behaves like the vimperator \
plugin for Firefox, and has usage paradigms from the editor vim."
LICENSE = "GPL-3.0-or-later"

PV = "3.6.0"

RPM_NAME = "vimb-3.6.0-2.9.aarch64.rpm"
RPM_HASH = "04ffdf2b1ef3f522107245d42f207bad012752ba7e7dea9f3c6e865f076e683da57d8fe38c7cacb3415ab6a0e78ad6dfb298fd54d9d435429a789c659f4cae16"

RPROVIDES:${PN} += "application() \
application(vimb.desktop) \
mimehandler(application/xhtml+xml) \
mimehandler(text/html) \
mimehandler(x-scheme-handler/http) \
mimehandler(x-scheme-handler/https) \
vimb \
vimb(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libjavascriptcoregtk-4.0.so.18()(64bit) \
libsoup-2.4.so.1()(64bit) \
libwebkit2gtk-4.0.so.37()(64bit)"

inherit rpm
