SUMMARY = "Documentation for texlive-autobreak"
DESCRIPTION = "This package includes the documentation for texlive-autobreak"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn43337"

RPM_NAME = "texlive-autobreak-doc-2023.209.0.0.3svn43337-54.1.noarch.rpm"
RPM_HASH = "9cbba5724073ee3723e574de4a57033d566c36eef51a94d3a1846af9aabe9c7aad12df4b594fbae2d2a8aeae3a5ad22cf303e9a3f669a5a6c8bfd5b5c90205a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-autobreak-doc-en \
texlive-autobreak-doc"

RDEPENDS:${PN} += ""

inherit rpm
