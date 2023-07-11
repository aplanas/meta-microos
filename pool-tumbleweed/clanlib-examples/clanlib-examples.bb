SUMMARY = "A Portable Interface for Writing Games"
DESCRIPTION = "ClanLib delivers a platform-independent interface for writing games."
LICENSE = "Zlib"

PV = "4.1.0"

RPM_NAME = "clanlib-examples-4.1.0-2.11.noarch.rpm"
RPM_HASH = "9c8e409bff5cc1b634f6f84cada4afdf6c2a4cc387538bbb549c9e19b1009ca2ea3b0c0c229025a59dae2043143ac35780ce5c7747afe82eadb7f96ab70e1e3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clanlib-examples"

RDEPENDS:${PN} += "clanlib \
clanlib-devel"

inherit rpm
