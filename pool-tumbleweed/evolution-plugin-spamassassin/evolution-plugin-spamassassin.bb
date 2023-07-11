SUMMARY = "SpamAssassin plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support for junk-mail filtering via spamassassin."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.4"

RPM_NAME = "evolution-plugin-spamassassin-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "31bba7aa9b64e0e8641ed8ba60a2f6f76a9f910f53f1414f3881458d57126af42b452f0a4052e0f470c8b274c4f0d649b660a6553c02d1f74340f96cb44baa2e"

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
