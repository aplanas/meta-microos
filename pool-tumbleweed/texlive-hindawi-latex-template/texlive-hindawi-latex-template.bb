SUMMARY = "A LaTeX template for authors of the Hindawi journals"
DESCRIPTION = "This package contains a LaTeX template for authors of the \
Hindawi journals. Authors can use this template for formatting \
their research articles for submissions. The package has been \
created and is maintained by the Typeset team."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn57757"

RPM_NAME = "texlive-hindawi-latex-template-2023.209.1.0svn57757-54.2.noarch.rpm"
RPM_HASH = "43dfd01880e0c3ea90cf7ae8f63028c99fde4115cb8e868cca4c32119473582d0d332e3197605e9825b144667fedba1d2b3a5a576fb556a71ab5b3de06d184eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hindawi-latex-template"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
