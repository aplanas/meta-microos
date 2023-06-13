SUMMARY = "Documentation for texlive-forest"
DESCRIPTION = "This package includes the documentation for texlive-forest"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.5svn57398"

RPM_NAME = "texlive-forest-doc-2023.201.2.1.5svn57398-52.1.noarch.rpm"
RPM_HASH = "fdf0dbab92164e2586857349e9291be4e9076abbbc5c4a86a8404551210752d634fba4d862f86a86b158af08dd784fcb284ff22f2b4b5ffa0730695056dcdb0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forest-doc"

RDEPENDS:${PN} += ""

inherit rpm
