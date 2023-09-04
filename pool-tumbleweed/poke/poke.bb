SUMMARY = "An interactive, extensible editor for binary data"
DESCRIPTION = "GNU poke is an interactive, extensible editor for binary data. Not limited to \
editing basic entities such as bits and bytes, it provides a full-fledged \
procedural, interactive programming language designed to describe data \
structures and to operate on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.3"

RPM_NAME = "poke-3.3-1.1.aarch64.rpm"
RPM_HASH = "26349935447aee54288a77246e46a2b6edc5e137b0bc90e0a73462e0ae661c78fe09c0088018e70587b0a888b72493ef9206150b13402ff36834496a7fbe0158"

RPROVIDES:${PN} += "poke"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpoke.so.0 \
libreadline.so.8 \
libtextstyle.so.0 \
libtinfo.so.6"

inherit rpm
