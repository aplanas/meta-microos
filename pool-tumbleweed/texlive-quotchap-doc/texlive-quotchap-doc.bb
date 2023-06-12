SUMMARY = "Documentation for texlive-quotchap"
DESCRIPTION = "This package includes the documentation for texlive-quotchap"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3svn56926"

RPM_NAME = "texlive-quotchap-doc-2023.201.1.3svn56926-53.1.noarch.rpm"
RPM_HASH = "b027e8902c3a516707fa4da811473b53c06fdfb86aa4d7c2d03e5d1d232bd1c73d0cf4e6046eac99d3abe22d5877d4c6da6b494c3a2308b8fa3a54764e942b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quotchap-doc"
RDEPENDS:${PN} += ""

inherit rpm
