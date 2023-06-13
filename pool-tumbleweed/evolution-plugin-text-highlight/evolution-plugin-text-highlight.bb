SUMMARY = "Text highlight plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support to highlight syntax of mails and their attachments."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.2"

RPM_NAME = "evolution-plugin-text-highlight-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "ed5dace4d9c5c66570b4159a7b2df3cd4c2e525f3a7b498805ab27ac644c02bf1754c965af29c823801c187f59b04c980581ad306017e0ca6014407e26a09051"

RPROVIDES:${PN} += "evolution-plugin-text-highlight \
evolution-plugin-text-highlight(aarch-64)"

RDEPENDS:${PN} += "evolution \
highlight \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcamel-1.2.so.64()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libevolution-mail-formatter.so()(64bit) \
libevolution-mail.so()(64bit) \
libevolution-shell.so()(64bit) \
libevolution-util.so()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libsoup-3.0.so.0()(64bit)"

inherit rpm
