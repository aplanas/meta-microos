SUMMARY = "Documentation for texlive-clefval"
DESCRIPTION = "This package includes the documentation for texlive-clefval"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn55985"

RPM_NAME = "texlive-clefval-doc-2023.201.0.0.1svn55985-53.1.noarch.rpm"
RPM_HASH = "ae6b370e346ee84fa8eadc8326e836bd3869b54307e15feb7e3bf5da2e0e7cc264e02ba817cd677a95e22dcffc71e7bdad9f862f733ac717d1f32dfe9cb4ab6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-clefval-doc:fr) \
texlive-clefval-doc"

RDEPENDS:${PN} += ""

inherit rpm
