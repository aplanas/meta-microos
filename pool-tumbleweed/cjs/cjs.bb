SUMMARY = "JavaScript module used by Cinnamon"
DESCRIPTION = "JavaScript bindings based on GObject Introspection for the \
Cinnamon Desktop."
LICENSE = "(GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later) & MIT"

PV = "5.0.0"

RPM_NAME = "cjs-5.0.0-1.11.aarch64.rpm"
RPM_HASH = "61a7452e07dec4e298634a545f9f5104f3dd774ba5c69ad4ecf7a58f6f314f7ef08d5457aa10d152db54b47cc9bfe2b937ca58460846f818c4a9ee1b29992aa7"

RPROVIDES:${PN} += "cjs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcjs.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmozjs-78.so.0"

inherit rpm
