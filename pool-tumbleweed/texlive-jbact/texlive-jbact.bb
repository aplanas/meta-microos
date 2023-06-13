SUMMARY = "BibTeX style for biology journals"
DESCRIPTION = "The style is a development of apalike.bst in the BibTeX bundle. \
The style serves two journals -- if the user executes \
'\\nocite{TitlesOn}', the style serves for the Journal of \
Theoretical Biology; otherwise it serves for the Journal of \
Molecular Biology."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.30svn52717"

RPM_NAME = "texlive-jbact-2023.201.1.30svn52717-55.1.noarch.rpm"
RPM_HASH = "d10138740bba2a8e569bd407253577c100194d1382ac389e08be62f6bd0e5a81b527de27d405f42b8710b2ab19925e6ddc56e6e7569a551db26b344d3bab0a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jbact"

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
