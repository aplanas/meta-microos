SUMMARY = "KDE spell checking library"
DESCRIPTION = "Sonnet is a plugin-based spell checking library for Qt-based \
applications. It supports several different plugins, including \
HSpell, Enchant, ASpell and HUNSPELL."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "sonnet-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "1d04073b47483a2abdf48ac1b64fb4b2750d3ad27a31eeb4e03dc47f9ccfa95456dc6cb8c0a6fbf362abe2365b31f07d01ce9618cda567ffc81b8b85f19a5ecd"

RPROVIDES:${PN} += "sonnet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5SonnetCore.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libhunspell-1.7.so.0 \
libstdc++.so.6"

inherit rpm
