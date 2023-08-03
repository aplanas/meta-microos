SUMMARY = "BibTeX style for biology journals"
DESCRIPTION = "The style is a development of apalike.bst in the BibTeX bundle. \
The style serves two journals -- if the user executes \
'\\nocite{TitlesOn}', the style serves for the Journal of \
Theoretical Biology; otherwise it serves for the Journal of \
Molecular Biology."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.30svn52717"

RPM_NAME = "texlive-jbact-2023.209.1.30svn52717-56.1.noarch.rpm"
RPM_HASH = "8043a88861a035fc83b4fc7af9bf8617eef2a2acad54664d475f737e9f42403275ef32818508175d7eeb7b9ee168f8024ad002840459582b91f51c7f8e945dfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jbact"

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
