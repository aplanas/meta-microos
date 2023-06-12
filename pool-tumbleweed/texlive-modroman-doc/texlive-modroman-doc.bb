SUMMARY = "Documentation for texlive-modroman"
DESCRIPTION = "This package includes the documentation for texlive-modroman"
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn29803"

RPM_NAME = "texlive-modroman-doc-2023.201.1svn29803-54.1.noarch.rpm"
RPM_HASH = "2cf9bba794b569f3b87b18c129576b0a03245ec40faea3d6dd2ce591a9c4b9c3bec09c37bc8fe49d6ab0ae90e333c1129d4d0047869ed442cb6ff4d416eadbae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-modroman-doc:en;fr) \
texlive-modroman-doc"
RDEPENDS:${PN} += ""

inherit rpm
