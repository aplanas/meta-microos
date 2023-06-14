SUMMARY = "Documentation for texlive-thaispec"
DESCRIPTION = "This package includes the documentation for texlive-thaispec"
LICENSE = "LPPL-1.0"

PV = "2023.201.2021.03.01svn58019"

RPM_NAME = "texlive-thaispec-doc-2023.201.2021.03.01svn58019-54.1.noarch.rpm"
RPM_HASH = "2819a7f35dadcf0525ced748f9cdc0f079c3e115cb213ab93ef33e6f9cef6533cc476bf1fa94729b84ff8415d3f4b76dd49b37d4bd29106e21d0f55c136e9b95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thaispec-doc-th \
texlive-thaispec-doc"

RDEPENDS:${PN} += ""

inherit rpm
