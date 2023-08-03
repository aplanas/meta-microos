SUMMARY = "Documentation for texlive-pgfopts"
DESCRIPTION = "This package includes the documentation for texlive-pgfopts"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1asvn56615"

RPM_NAME = "texlive-pgfopts-doc-2023.209.2.1asvn56615-52.1.noarch.rpm"
RPM_HASH = "b5b0febdbde75c25cb2e7b39e36cf1841cddee51a461b0bbc37f5a7455513055378f8bf6b67db32b07947b9074e580598c1c57628e660bff13fbd63dc95b813f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfopts-doc"

RDEPENDS:${PN} += ""

inherit rpm
