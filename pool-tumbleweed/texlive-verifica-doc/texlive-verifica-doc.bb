SUMMARY = "Documentation for texlive-verifica"
DESCRIPTION = "This package includes the documentation for texlive-verifica"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn56625"

RPM_NAME = "texlive-verifica-doc-2023.201.1.3svn56625-53.1.noarch.rpm"
RPM_HASH = "badf80dfafe02688a852442b5b9f7f7d93d72d87a76f3004a8e73229d80cce2e5af3556149c66e4dd4e399d63b5fcfa6284cfe69e1e2a0a9866239dcb6455d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-verifica-doc:it) \
texlive-verifica-doc"

RDEPENDS:${PN} += ""

inherit rpm
