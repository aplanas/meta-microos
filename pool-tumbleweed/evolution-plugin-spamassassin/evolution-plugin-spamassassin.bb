SUMMARY = "SpamAssassin plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support for junk-mail filtering via spamassassin."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.2"

RPM_NAME = "evolution-plugin-spamassassin-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "b4ffaf1ab3e0aee617a78bb6681e9f51906db59ca362acac74bd9ef395fa83a978253aa1c5ea5ebf3a01a889475f10f0bde380bfea408e776e32e2902c8eb281"

RPROVIDES:${PN} += "evolution-plugin-spamassassin"

RDEPENDS:${PN} += "evolution \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.64 \
libedataserver-1.2.so.27 \
libemail-engine.so \
libevolution-util.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
spamassassin"

inherit rpm
