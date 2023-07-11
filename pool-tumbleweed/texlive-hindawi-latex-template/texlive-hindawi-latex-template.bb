SUMMARY = "A LaTeX template for authors of the Hindawi journals"
DESCRIPTION = "This package contains a LaTeX template for authors of the \
Hindawi journals. Authors can use this template for formatting \
their research articles for submissions. The package has been \
created and is maintained by the Typeset team."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn57757"

RPM_NAME = "texlive-hindawi-latex-template-2023.201.1.0svn57757-53.2.noarch.rpm"
RPM_HASH = "8aba9d2e8e162685eae075a42fdcb988a115ae64a99b6f5fc792fed62b4e19bc561c841d06fb39d29f49d6ffe7be83fb84569ff63add89ba20a7d27d77a356b8"
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
