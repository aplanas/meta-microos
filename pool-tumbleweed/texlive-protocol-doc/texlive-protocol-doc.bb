SUMMARY = "Documentation for texlive-protocol"
DESCRIPTION = "This package includes the documentation for texlive-protocol"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.13svn25562"

RPM_NAME = "texlive-protocol-doc-2023.209.1.13svn25562-53.1.noarch.rpm"
RPM_HASH = "36c590c2319acc845736f76c8fe2a910f6c3ba1b93bee618660f7e8a7dadf66934143cc5cbeaccaa099bbbc1daee27c358206e2f16a7efa48aaa311e79a8abe6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-protocol-doc-en;de \
texlive-protocol-doc"

RDEPENDS:${PN} += ""

inherit rpm
