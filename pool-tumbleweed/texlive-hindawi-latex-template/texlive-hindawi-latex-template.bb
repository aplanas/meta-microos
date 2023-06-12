SUMMARY = "A LaTeX template for authors of the Hindawi journals"
DESCRIPTION = "This package contains a LaTeX template for authors of the \
Hindawi journals. Authors can use this template for formatting \
their research articles for submissions. The package has been \
created and is maintained by the Typeset team."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn57757"

RPM_NAME = "texlive-hindawi-latex-template-2023.201.1.0svn57757-53.1.noarch.rpm"
RPM_HASH = "df724cf54e22a6dc73412f850e624b6b80b301e2c4b1a6766dd738975b4191ce8d78a309f1e65a6dd4da9407d49e0e33bfb6adfc9c7008d013205e7ed22c4edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hindawi-latex-template"
RDEPENDS:${PN} += "/bin/sh \
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
