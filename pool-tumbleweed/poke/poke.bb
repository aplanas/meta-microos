SUMMARY = "An interactive, extensible editor for binary data"
DESCRIPTION = "GNU poke is an interactive, extensible editor for binary data. Not limited to \
editing basic entities such as bits and bytes, it provides a full-fledged \
procedural, interactive programming language designed to describe data \
structures and to operate on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.2"

RPM_NAME = "poke-3.2-1.1.aarch64.rpm"
RPM_HASH = "07ee92ad7de063ccb900c9ba51d4f32666240558e042b48ff332fdf8a89188d3d9a0bd7261bdf96dd281e74a737c7b56b90fee589e14d9b9413c5123c6a8d66a"

RPROVIDES:${PN} += "poke"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpoke.so.0 \
libreadline.so.8 \
libtextstyle.so.0 \
libtinfo.so.6"

inherit rpm
