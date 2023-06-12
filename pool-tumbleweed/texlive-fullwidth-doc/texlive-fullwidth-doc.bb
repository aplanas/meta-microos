SUMMARY = "Documentation for texlive-fullwidth"
DESCRIPTION = "This package includes the documentation for texlive-fullwidth"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn24684"

RPM_NAME = "texlive-fullwidth-doc-2023.201.0.0.1svn24684-52.1.noarch.rpm"
RPM_HASH = "6a78c5b7531914c50c69fd97c5ecd1f0c1ebd4a5669ac6b0be9cfb55b709a262a3775f03667f9fa622ee201f0a05eac4ca820518385d8688a1583fa1b9e1e153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fullwidth-doc"
RDEPENDS:${PN} += ""

inherit rpm
