SUMMARY = "Documentation for texlive-typewriter"
DESCRIPTION = "This package includes the documentation for texlive-typewriter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn46641"

RPM_NAME = "texlive-typewriter-doc-2023.209.1.1svn46641-53.1.noarch.rpm"
RPM_HASH = "8517efc3b80a8ec9c3ab35cb3f031eb8c5829ac545e9036c9b5b0251d6e6e9dca6d0396841ddea1a1e651979d52409715ba2236dcfe825e2283a51bd9eb0c1d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typewriter-doc"

RDEPENDS:${PN} += ""

inherit rpm
