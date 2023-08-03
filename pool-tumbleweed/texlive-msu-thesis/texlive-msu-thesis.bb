SUMMARY = "Class for Michigan State University Master's and PhD theses"
DESCRIPTION = "This is a class file for producing dissertations and theses \
according to the Michigan State University Graduate School \
Guidelines for Electronic Submission of Master's Theses and \
Dissertations. The class should meet all current requirements \
and is updated whenever the university guidelines change. The \
class is based on the memoir document class, and inherits the \
functionality of that class."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0bsvn65462"

RPM_NAME = "texlive-msu-thesis-2023.209.4.0bsvn65462-55.1.noarch.rpm"
RPM_HASH = "454ce8e1714c126a380f11a7e147f19b2b96fb3ee8731e822b7bbe3fe1965a3661c295642a587d56bb98d0d8826e52912b4242a34ff55a732b787254cd6bf4f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-msu-thesis.cls \
texlive-msu-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-etoolbox.sty \
tex-memoir.cls \
tex-pdflscape.sty \
tex-textpos.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
