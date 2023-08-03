SUMMARY = "Templates for TeX usage"
DESCRIPTION = "A set of templates for using LaTeX packages that the author \
uses, comprising: - Hausarbeit.tex: for students of the \
Lehrstuhl Volkskunde an der Friedrich-Schiller-Universitat \
Jena; - Psycho-Dipl.tex: for diploma theses in psychology."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-templates-sommer-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "c0c8b85ff890b97769d746b101f34c4c19b99ddd61d7dfdbd91f9c6842d63611ab11e5f5eca9e0f4a94ca1499214c7f7a66ff9fc17601eb60616f88060f7b7e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-templates-sommer"

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
