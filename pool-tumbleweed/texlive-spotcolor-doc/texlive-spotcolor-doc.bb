SUMMARY = "Documentation for texlive-spotcolor"
DESCRIPTION = "This package includes the documentation for texlive-spotcolor"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-spotcolor-doc-2023.209.1.2svn15878-58.1.noarch.rpm"
RPM_HASH = "11a626060e6ae30522fa9d7f8a4618c563ef0d1d00d343ec485eb9f7e0efe45dd5ba8320f6c73626c454148eb5619cf76727642b70849235d95258c0f75d9630"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spotcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
