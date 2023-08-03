SUMMARY = "Documentation for texlive-gender"
DESCRIPTION = "This package includes the documentation for texlive-gender"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36464"

RPM_NAME = "texlive-gender-doc-2023.209.1.0svn36464-53.1.noarch.rpm"
RPM_HASH = "00f2bd45e12b9d9484f5b940abff64bca64819ef46dc09ee35c7282c13f1e0a143c2b185d4a1b51f988bc01f59642485fed301583e8e368a9da56a9fe8e46bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gender-doc"

RDEPENDS:${PN} += ""

inherit rpm
