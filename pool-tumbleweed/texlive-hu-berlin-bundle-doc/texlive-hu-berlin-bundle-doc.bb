SUMMARY = "Documentation for texlive-hu-berlin-bundle"
DESCRIPTION = "This package includes the documentation for texlive-hu-berlin-bundle"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1.1svn57580"

RPM_NAME = "texlive-hu-berlin-bundle-doc-2023.208.1.1.1svn57580-53.1.noarch.rpm"
RPM_HASH = "b63c53c3b5f595885f6f6bcaac01badb4a3f33fc0ed7b4990aa605859fad0af2937cb8ffe48d8cab3cdb960a578d852b8dcf3672a89c0fb2fea1474b736627ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hu-berlin-bundle-doc"

RDEPENDS:${PN} += ""

inherit rpm
