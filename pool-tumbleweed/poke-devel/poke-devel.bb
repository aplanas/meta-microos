SUMMARY = "Devel package for poke"
DESCRIPTION = "Development package for poke."
LICENSE = "GPL-3.0-or-later"

PV = "3.2"

RPM_NAME = "poke-devel-3.2-1.1.aarch64.rpm"
RPM_HASH = "51d10f874bd7fc48cc620877a9a383fd0fab3fc3adf131989d64bb06b7df93780d0866f635e5b0164a4ca0a3cd767dfb8102feb445c14cbe48fa5e912ec5f3ca"

RPROVIDES:${PN} += "pkgconfig(poke) \
poke-devel \
poke-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpoke0"

inherit rpm
