SUMMARY = "Documentation for texlive-robustcommand"
DESCRIPTION = "This package includes the documentation for texlive-robustcommand"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-robustcommand-doc-2023.201.0.0.1svn15878-53.2.noarch.rpm"
RPM_HASH = "7cae25e08c856ca5216b510ae46a809a4ad2f760cd6dd87351a9a8fabe2f8ece98a341606395b8bfaa37dec8f5c26842eee79767e35578714fdfae7454ada020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-robustcommand-doc-de \
texlive-robustcommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
