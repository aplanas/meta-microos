SUMMARY = "Mousepad plugin provider"
DESCRIPTION = "A plugin provider for the Mousepad text editor"
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "libmousepad0-0.6.1-1.1.aarch64.rpm"
RPM_HASH = "2a804d03f8779205b023c48bd9746b5d24aeff74c842c9793818c09515141301af498980307a0830c9eb54ffe379e53d035ebf7fc97a03d12c94e29d7ee9ddab"

RPROVIDES:${PN} += "libmousepad.so.0 \
libmousepad0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libpango-1.0.so.0 \
mousepad"

inherit rpm
