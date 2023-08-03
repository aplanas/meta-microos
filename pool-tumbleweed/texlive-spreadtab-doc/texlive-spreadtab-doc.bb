SUMMARY = "Documentation for texlive-spreadtab"
DESCRIPTION = "This package includes the documentation for texlive-spreadtab"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn50147"

RPM_NAME = "texlive-spreadtab-doc-2023.209.0.0.5svn50147-58.1.noarch.rpm"
RPM_HASH = "ac1c5bfc3beadeb6af8b6238de26abcd33084839ea2fe1bb963b4c17b77fd68105767eba262f38c20ef3e6fe83cde9dead1189c8d6a0bd7983c412b914fd5108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-spreadtab-doc-en;fr \
texlive-spreadtab-doc"

RDEPENDS:${PN} += ""

inherit rpm
