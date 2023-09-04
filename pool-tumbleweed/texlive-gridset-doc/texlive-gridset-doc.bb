SUMMARY = "Documentation for texlive-gridset"
DESCRIPTION = "This package includes the documentation for texlive-gridset"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn53762"

RPM_NAME = "texlive-gridset-doc-2023.209.0.0.3svn53762-54.2.noarch.rpm"
RPM_HASH = "3b73be6460cf54ad5a1ee56c102ca002f7c5620ba2482fe87a11b51f11fe5bfb5080587067fb2bbeaccc5b99e894fff1ee536c86c0632dc9a41f29851d80f394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridset-doc"

RDEPENDS:${PN} += ""

inherit rpm
