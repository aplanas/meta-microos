SUMMARY = "A Portable Interface for Writing Games"
DESCRIPTION = "ClanLib delivers a platform-independent interface for writing games."
LICENSE = "Zlib"

PV = "4.1.0"

RPM_NAME = "clanlib-examples-4.1.0-2.10.noarch.rpm"
RPM_HASH = "c79a661612f0984d22b52d32293f7c2f53b78354116fe9df2608d1dadc64ac86a1a0e07cf4d077e24a5fbd5f28e48aefd257fc0e28f02b5dd3f217ee95eb3c49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clanlib-examples"

RDEPENDS:${PN} += "clanlib \
clanlib-devel"

inherit rpm
