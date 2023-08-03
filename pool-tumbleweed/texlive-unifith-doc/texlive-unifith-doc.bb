SUMMARY = "Documentation for texlive-unifith"
DESCRIPTION = "This package includes the documentation for texlive-unifith"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn60698"

RPM_NAME = "texlive-unifith-doc-2023.209.1.6svn60698-54.1.noarch.rpm"
RPM_HASH = "1e3e4c52e04f258ee60e517bb11e49d8200309b13030ea7cd3f90f47ff55b1eef9e985c40dc07bd254d6fece0eed8e6b4661c9ccc4079a8b331b805da29d737a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unifith-doc"

RDEPENDS:${PN} += ""

inherit rpm
