SUMMARY = "Documentation for texlive-biblatex-luh-ipw"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-luh-ipw"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn32180"

RPM_NAME = "texlive-biblatex-luh-ipw-doc-2023.201.0.0.3svn32180-53.1.noarch.rpm"
RPM_HASH = "6bb5d635c7ac8d091d425f20d7550bc80d9379cf59dd1df8912d938c58b0e70233350ebce029e07ed194ef5a65201c0f6655e9a3ebc86a9f4efb40d191e13d77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-biblatex-luh-ipw-doc:de) \
texlive-biblatex-luh-ipw-doc"

RDEPENDS:${PN} += ""

inherit rpm
