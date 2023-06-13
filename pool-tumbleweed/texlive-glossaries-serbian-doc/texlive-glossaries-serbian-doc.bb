SUMMARY = "Documentation for texlive-glossaries-serbian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-serbian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-serbian-doc-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "ccc2406921a27bc5a275524e91431738ab435973f311f7f3bc32fdc6ffdeaa04eefe1207062820b2bbe1db00df0f2bbc2ee08782b7f24990a7215f3d852c8cd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-serbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
