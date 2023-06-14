SUMMARY = "A LaTeX class to typeset recipes"
DESCRIPTION = "The layout design is relatively straightforward (and \
traditional: see 'sample output' under 'documentation'); the \
class uses the Bookman and the BrushScript-Italic fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.9svn54080"

RPM_NAME = "texlive-recipe-2023.201.0.0.9svn54080-53.1.noarch.rpm"
RPM_HASH = "2407da205ce6187f8aee0893977aa6fcb89907b3f230024f5f7f56e0a4329980ceaa28d99b8065dd086b304baffcd8f3251f11681224574486844b41719e9cd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-recipe.cls \
texlive-recipe"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
