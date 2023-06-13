SUMMARY = "Documentation for texlive-swimgraf"
DESCRIPTION = "This package includes the documentation for texlive-swimgraf"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn25446"

RPM_NAME = "texlive-swimgraf-doc-2023.201.svn25446-57.1.noarch.rpm"
RPM_HASH = "3c216d99529e4e309f911cc33bdb6596f38e7db7a2bac613f80f763917525a695df656507bd39a395555f1c58b04d854a7f9fccf3d29b60f9fbbe189273dfec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swimgraf-doc"

RDEPENDS:${PN} += ""

inherit rpm
