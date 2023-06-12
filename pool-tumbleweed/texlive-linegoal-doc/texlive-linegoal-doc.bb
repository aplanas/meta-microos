SUMMARY = "Documentation for texlive-linegoal"
DESCRIPTION = "This package includes the documentation for texlive-linegoal"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.9svn21523"

RPM_NAME = "texlive-linegoal-doc-2023.201.2.9svn21523-54.1.noarch.rpm"
RPM_HASH = "dfe3b3dd69a6fa427771c3b52359d7a4ab14599146ec13e67bafb62983a70241308c998c9d70e72d9c25907b02ea422dc399ae4944a5507dc3909a780df27f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linegoal-doc"
RDEPENDS:${PN} += ""

inherit rpm
