SUMMARY = "Documentation for texlive-ufrgscca"
DESCRIPTION = "This package includes the documentation for texlive-ufrgscca"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.8svn65661"

RPM_NAME = "texlive-ufrgscca-doc-2023.209.1.0.8svn65661-54.1.noarch.rpm"
RPM_HASH = "ac73cb82bf10e4965c835b3398e4bf2e4b2275ec07c4b1bf4490e37554a41a728415a965f57d390f26f95e1bb53fde3a7a4730698a0908186b68f4b29fe11b06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ufrgscca-doc"

RDEPENDS:${PN} += ""

inherit rpm
