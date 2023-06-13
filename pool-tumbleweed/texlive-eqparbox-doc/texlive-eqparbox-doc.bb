SUMMARY = "Documentation for texlive-eqparbox"
DESCRIPTION = "This package includes the documentation for texlive-eqparbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1svn45215"

RPM_NAME = "texlive-eqparbox-doc-2023.201.4.1svn45215-53.1.noarch.rpm"
RPM_HASH = "7d1db6d7b507ff4af160f825eae2f3388d3d449520df804c6850272923afceade66d83d8ca6a10bd7120546dd682bbf974f8335a7ef15a9d93ef407f319efe3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqparbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
