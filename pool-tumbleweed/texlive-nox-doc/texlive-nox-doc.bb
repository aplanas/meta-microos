SUMMARY = "Documentation for texlive-nox"
DESCRIPTION = "This package includes the documentation for texlive-nox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn30991"

RPM_NAME = "texlive-nox-doc-2023.201.1.0svn30991-54.1.noarch.rpm"
RPM_HASH = "204d7bc9b93626f717c78d2e3aa5b6e24cfcde3e2584f124d2d62d71937b513bc4980bc0e0c0a2042c4783cfecab0bb30f534f015834d6f13fed5a11f8f921c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nox-doc-de \
texlive-nox-doc"

RDEPENDS:${PN} += ""

inherit rpm
