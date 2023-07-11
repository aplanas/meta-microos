SUMMARY = "Documentation for texlive-iitem"
DESCRIPTION = "This package includes the documentation for texlive-iitem"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn29613"

RPM_NAME = "texlive-iitem-doc-2023.208.1.0svn29613-53.1.noarch.rpm"
RPM_HASH = "530451872300006209de355d9ac21fa60cc2c54f76ab565161d9211c6ec0b848ed9535ff61847723cedd1ef7b2fbe2c830cd4fe6424f1f65a92111624067bc54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iitem-doc"

RDEPENDS:${PN} += ""

inherit rpm
