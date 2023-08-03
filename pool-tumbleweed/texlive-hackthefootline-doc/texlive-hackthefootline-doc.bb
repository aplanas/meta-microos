SUMMARY = "Documentation for texlive-hackthefootline"
DESCRIPTION = "This package includes the documentation for texlive-hackthefootline"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46494"

RPM_NAME = "texlive-hackthefootline-doc-2023.209.svn46494-54.1.noarch.rpm"
RPM_HASH = "aa5c6e8ff3d85ac53732996fc415c735d53c729390a18202d80c7369b34a736876591843696d7758cacb97c6f8fc9b83da47c8129b6c62c2d326e3e67440a7e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hackthefootline-doc"

RDEPENDS:${PN} += ""

inherit rpm
