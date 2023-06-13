SUMMARY = "Documentation for texlive-unam-thesis"
DESCRIPTION = "This package includes the documentation for texlive-unam-thesis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.5svn51207"

RPM_NAME = "texlive-unam-thesis-doc-2023.201.0.0.5svn51207-53.1.noarch.rpm"
RPM_HASH = "6ffe19642d8ce8a77227abf744633c4487cfdf262986222940ca71e34c67fcc0af26c2fb83ae11dead907540317f21a46fc184c9871f7f620e5312f83ed171e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unam-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
