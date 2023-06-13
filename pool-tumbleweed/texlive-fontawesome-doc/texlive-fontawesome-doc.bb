SUMMARY = "Documentation for texlive-fontawesome"
DESCRIPTION = "This package includes the documentation for texlive-fontawesome"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.6.3.2svn48145"

RPM_NAME = "texlive-fontawesome-doc-2023.201.4.6.3.2svn48145-52.1.noarch.rpm"
RPM_HASH = "887caa21b72fbad32b3167358b5a6a09970241a2393dce8b107a9d3e09b70ce8fbd28b1ed37558ebd245a9c00957048dc9827e785010dd3ef0b0413fbb630f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontawesome-doc"

RDEPENDS:${PN} += ""

inherit rpm
