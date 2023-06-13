SUMMARY = "Documentation for texlive-coursepaper"
DESCRIPTION = "This package includes the documentation for texlive-coursepaper"
LICENSE = "LPPL-1.0"

PV = "2023.204.2.0svn15878"

RPM_NAME = "texlive-coursepaper-doc-2023.204.2.0svn15878-54.1.noarch.rpm"
RPM_HASH = "da4a1fb271a56d5b34b85f2d59c0417acd0105e04fa3fd8e0274829582a83824bb1bcb55274cd64b3614a692de4bba27a3854a08dc892447f70426156ba0a3bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coursepaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
