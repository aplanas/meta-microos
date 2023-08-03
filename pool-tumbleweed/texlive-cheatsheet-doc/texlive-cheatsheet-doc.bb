SUMMARY = "Documentation for texlive-cheatsheet"
DESCRIPTION = "This package includes the documentation for texlive-cheatsheet"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn45069"

RPM_NAME = "texlive-cheatsheet-doc-2023.209.0.0.8svn45069-54.1.noarch.rpm"
RPM_HASH = "04c2d17da049c7d3fdc9b94c44c8bca9f1f986e0dcfc4e291ab0dae1038ed45e63d7e3052b5e16e3a67cf2644243d1b7af7a2e6a139f33cf977b921796536f0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cheatsheet-doc"

RDEPENDS:${PN} += ""

inherit rpm
