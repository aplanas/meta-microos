SUMMARY = "Compilation of plugins for Pidgin"
DESCRIPTION = "The Purple Plugin Pack is a compilation of plugins for the \
libpurple family of IM clients. \
 \
This package provides the Pidgin plugins from the Purple Plugin Pack. \
 \
To avoid licence issues between GPLv+ plugins and other plugins \
that could be incompatible with GPLv3+, the GPLv3+ plugins are split \
into the pidgin-plugin-pack-extras package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "pidgin-plugin-pack-2.8.0-1.3.aarch64.rpm"
RPM_HASH = "94f4d017dc1049b6e47fb1a355573bb7ba25b4e7b5038a4c37476619d54b15ce205a49180ef261b89e08fc049b7abcdc36ac3242a2cc8ef1f9864c9026f25b8f"

RPROVIDES:${PN} += "pidgin-plugin-pack"

RDEPENDS:${PN} += "libc.so.6 \
libenchant-2.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libgtkspell.so.0 \
libpango-1.0.so.0 \
libpurple-plugin-pack \
libpurple.so.0 \
pidgin"

inherit rpm
