SUMMARY = "A Portable Interface for Writing Games"
DESCRIPTION = "ClanLib delivers a platform-independent interface for writing games."
LICENSE = "Zlib"

PV = "4.1.0"

RPM_NAME = "clanlib-doc-4.1.0-2.10.noarch.rpm"
RPM_HASH = "2d00ced6e44341791619887340c0dcc4333b78eb68dbcb1d1ad240c2316d39525013f431f6552eca22f01eb6bcd545703794f2148b8008279e8a275aae253b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clanlib-doc"

RDEPENDS:${PN} += ""

inherit rpm
