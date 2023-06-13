SUMMARY = "Documentation for texlive-newunicodechar"
DESCRIPTION = "This package includes the documentation for texlive-newunicodechar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn47382"

RPM_NAME = "texlive-newunicodechar-doc-2023.201.1.2svn47382-54.1.noarch.rpm"
RPM_HASH = "60ebca5b92fbb18cafe9fd960f159402e54ab2fad6d3cfe17d57eb8b6d5522884bab774cb3e8a5feda69e97af124c332252380c8f06575f4f50790d084be085e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newunicodechar-doc"

RDEPENDS:${PN} += ""

inherit rpm
