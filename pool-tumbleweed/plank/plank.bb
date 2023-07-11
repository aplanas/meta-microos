SUMMARY = "Trivial dock"
DESCRIPTION = "Plank is a trivial dock. \
 \
It is a library which can be extended to create other \
dock programs with more advanced features."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.89"

RPM_NAME = "plank-0.11.89-2.5.aarch64.rpm"
RPM_HASH = "73f9c847f30999df0ae0d3095d006205dca777a9fe849381255f6d381e03518444eb1e4c7bd8d00604978ffcb469625f5ee8b56856ac79745b77866ffe2a0065"

RPROVIDES:${PN} += "plank"

RDEPENDS:${PN} += "bamf-daemon \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libplank.so.1"

inherit rpm
