SUMMARY = "Text categorization library"
DESCRIPTION = "Graphite2 is a project within SIL's Non-Roman Script Initiative and Language \
Software Development groups to provide rendering capabilities for complex \
non-Roman writing systems. Graphite can be used to create 'smart fonts' capable \
of displaying writing systems with various complex behaviors. With respect to \
the Text Encoding Model, Graphite handles the 'Rendering' aspect of writing \
system implementation."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "1.3.14"

RPM_NAME = "libgraphite2-3-1.3.14-3.8.aarch64.rpm"
RPM_HASH = "03c3634fb592e5c460fbe1b9785b31693a5b83ba5643d555a460cf85fe57c34036ae0b71a671af4c3e230cd3696cfd70fb0073e569db74658355c49ebd751de2"

RPROVIDES:${PN} += "libgraphite2-3 \
libgraphite2.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
