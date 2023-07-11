SUMMARY = "Documentation for texlive-repere"
DESCRIPTION = "This package includes the documentation for texlive-repere"
LICENSE = "LPPL-1.0"

PV = "2023.201.23.02svn65769"

RPM_NAME = "texlive-repere-doc-2023.201.23.02svn65769-53.2.noarch.rpm"
RPM_HASH = "d9cdfac6f362110c80322eadb173f4223521e548ff65054bfc10065cb5b9f8b5722373e88b12f9e6439406405a0c19d3a2f3ea3ffce82e84b44798fd0471047a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-repere-doc-fr \
texlive-repere-doc"

RDEPENDS:${PN} += ""

inherit rpm
