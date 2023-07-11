SUMMARY = "Documentation for texlive-interpreter"
DESCRIPTION = "This package includes the documentation for texlive-interpreter"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn27232"

RPM_NAME = "texlive-interpreter-doc-2023.208.1.2svn27232-53.1.noarch.rpm"
RPM_HASH = "38f551b6a5c9829d45a11cf0dd685fa98f99743925c31854e077d4823648daa15b8877d1405029de34d995cd2dd27564446dacf814c3479fa4b2b66ceb4deb57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interpreter-doc"

RDEPENDS:${PN} += ""

inherit rpm
