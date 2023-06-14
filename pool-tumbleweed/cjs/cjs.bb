SUMMARY = "JavaScript module used by Cinnamon"
DESCRIPTION = "JavaScript bindings based on GObject Introspection for the \
Cinnamon Desktop."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "5.0.0"

RPM_NAME = "cjs-5.0.0-1.10.aarch64.rpm"
RPM_HASH = "6b10f01bf9199767e5ca3c092828fc71e7ec27be22b6cfecda75c2ce969f2f218b8d5963dba16178f0c95b77967eba26195fe91a16c9a1dd95685baa0d9e83d5"

RPROVIDES:${PN} += "cjs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcjs.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmozjs-78.so.0"

inherit rpm
