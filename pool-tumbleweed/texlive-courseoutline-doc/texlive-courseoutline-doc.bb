SUMMARY = "Documentation for texlive-courseoutline"
DESCRIPTION = "This package includes the documentation for texlive-courseoutline"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-courseoutline-doc-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "9f275804fab0765a3f3b8c113825438a198a4aea4849e8808ec87b49432d20b6417292c75c83314d5e2732afbe9133f9500ca0759ceab840ff99607888e52940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-courseoutline-doc"

RDEPENDS:${PN} += ""

inherit rpm
