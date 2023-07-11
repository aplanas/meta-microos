SUMMARY = "Text highlight plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support to highlight syntax of mails and their attachments."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.4"

RPM_NAME = "evolution-plugin-text-highlight-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "67c9685e907e5081499c6120c7a68daba4c4de70e275999e48bab8ddfa02158489ff881f82ba9ca2b7caa2cedee699f2ed0b75e43641771a04b1f47eda5aeeab"

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
