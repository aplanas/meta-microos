SUMMARY = "A LaTeX template for authors of the Hindawi journals"
DESCRIPTION = "This package contains a LaTeX template for authors of the \
Hindawi journals. Authors can use this template for formatting \
their research articles for submissions. The package has been \
created and is maintained by the Typeset team."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn57757"

RPM_NAME = "texlive-hindawi-latex-template-2023.209.1.0svn57757-54.1.noarch.rpm"
RPM_HASH = "efaed9b5823a6c5784ef8af9e7b39ccd45ddc11217fcf2861a71b8ad8ead1ce6a4e6c3f0acded249c7340df2f4d39eec5d3733e1e4f9db18ad48b5ec9b42d630"
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
