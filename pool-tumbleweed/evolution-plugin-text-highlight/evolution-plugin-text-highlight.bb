SUMMARY = "Text highlight plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support to highlight syntax of mails and their attachments."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.2"

RPM_NAME = "evolution-plugin-text-highlight-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "ed5dace4d9c5c66570b4159a7b2df3cd4c2e525f3a7b498805ab27ac644c02bf1754c965af29c823801c187f59b04c980581ad306017e0ca6014407e26a09051"

RPROVIDES:${PN} += "evolution-plugin-text-highlight"

RDEPENDS:${PN} += "evolution \
highlight \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.64 \
libedataserver-1.2.so.27 \
libevolution-mail-formatter.so \
libevolution-mail.so \
libevolution-shell.so \
libevolution-util.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
