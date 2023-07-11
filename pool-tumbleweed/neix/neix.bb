SUMMARY = "News Reader for Text Terminals"
DESCRIPTION = "neix is a RSS/Atom news feed reader."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.5"

RPM_NAME = "neix-0.1.5-1.10.aarch64.rpm"
RPM_HASH = "e5cb50d8c08a61eda4020a8dff08d8939cb51e0f2e03416a1f47868cfc6bb639aa222ee5e158a94aea505d59bdf54300a8e18478ce68a5ffd2f16ecc214905e6"

RPROVIDES:${PN} += "neix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
