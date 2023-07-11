SUMMARY = "Bogofilter plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support for junk-mail filtering via bogofilter."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.4"

RPM_NAME = "evolution-plugin-bogofilter-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "688ab723a961c0f1074dcc95803e6607c75c0f0428f6332d74d2561b9f7871177dd31bc0fe82f4aa1bca1ef68d4dfdaca02012786bc3f79982634974944e4f9b"

RPROVIDES:${PN} += "evolution-plugin-bogofilter"

RDEPENDS:${PN} += "bogofilter \
evolution \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.64 \
libedataserver-1.2.so.27 \
libemail-engine.so \
libevolution-util.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
