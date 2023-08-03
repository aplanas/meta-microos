SUMMARY = "Documentation for texlive-scientific-thesis-cover"
DESCRIPTION = "This package includes the documentation for texlive-scientific-thesis-cover"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0.2svn47923"

RPM_NAME = "texlive-scientific-thesis-cover-doc-2023.209.4.0.2svn47923-54.1.noarch.rpm"
RPM_HASH = "678477a072aa1550eff4dce82650a256fac3317fd7ae08b80f706f906643a689341c4c68b53ed7040cd8d7b9180e5faf32afb4169c29e462b2a6c67dd891d8c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scientific-thesis-cover-doc"

RDEPENDS:${PN} += ""

inherit rpm
