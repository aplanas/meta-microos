SUMMARY = "Documentation for texlive-annotate-equations"
DESCRIPTION = "This package includes the documentation for texlive-annotate-equations"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn65851"

RPM_NAME = "texlive-annotate-equations-doc-2023.201.0.0.2.0svn65851-54.1.noarch.rpm"
RPM_HASH = "becbc4aaa15fdd703e461fb78c1b6e35faab78a4d60fcbed057f4c991775a6b23e237a2b30fc83f23fbd9eba960eed0645f5b80e61ddcae134362a4f015a5213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-annotate-equations-doc"
RDEPENDS:${PN} += ""

inherit rpm
