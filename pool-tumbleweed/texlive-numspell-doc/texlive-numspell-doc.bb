SUMMARY = "Documentation for texlive-numspell"
DESCRIPTION = "This package includes the documentation for texlive-numspell"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn61132"

RPM_NAME = "texlive-numspell-doc-2023.209.1.5svn61132-55.1.noarch.rpm"
RPM_HASH = "240b59008a00e3da202cab2d762e596761e9e31af6331e50e84d2ff66e902d77949ef650b3ea298d1bdf4140bd21ea49b59a33abf8bffb6d7ee2fb2d82e642fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numspell-doc"

RDEPENDS:${PN} += ""

inherit rpm
