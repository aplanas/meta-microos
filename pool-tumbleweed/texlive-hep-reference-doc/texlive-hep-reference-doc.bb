SUMMARY = "Documentation for texlive-hep-reference"
DESCRIPTION = "This package includes the documentation for texlive-hep-reference"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64853"

RPM_NAME = "texlive-hep-reference-doc-2023.201.1.1svn64853-53.2.noarch.rpm"
RPM_HASH = "b6f2d79fca36dc84181cedc1f4ef16268fc79581a584eea436e914255f25dd470b7b0f99f884a30272b5781bfe082b16666d7876e5a113bf4d1126d541e4c45f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-reference-doc"

RDEPENDS:${PN} += ""

inherit rpm
