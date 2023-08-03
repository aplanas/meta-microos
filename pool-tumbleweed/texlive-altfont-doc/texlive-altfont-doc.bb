SUMMARY = "Documentation for texlive-altfont"
DESCRIPTION = "This package includes the documentation for texlive-altfont"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-altfont-doc-2023.209.1.1svn15878-55.1.noarch.rpm"
RPM_HASH = "6fddb1a68c8e046008dde063293a790f3aa074c2352183aaa4646376a5bb9232c1eb9f03dabf714f25956ac2c7b07c18892f9a2b68e920016e971cf2072cb1c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-altfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
