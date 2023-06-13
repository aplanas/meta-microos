SUMMARY = "Documentation for texlive-uwmslide"
DESCRIPTION = "This package includes the documentation for texlive-uwmslide"
LICENSE = "Artistic-1.0"

PV = "2023.201.svn27354"

RPM_NAME = "texlive-uwmslide-doc-2023.201.svn27354-53.1.noarch.rpm"
RPM_HASH = "19b8ce7041afc7ebbde57ff715788972bb4f8a58b253163886558f4ebc210f6185b940e877ac62d62fa9e36896ba552b6a9b40d4655d8f5e1e5b15dcf71a496b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwmslide-doc"

RDEPENDS:${PN} += ""

inherit rpm
