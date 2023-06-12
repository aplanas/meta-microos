SUMMARY = "Class for Michigan State University Master's and PhD theses"
DESCRIPTION = "This is a class file for producing dissertations and theses \
according to the Michigan State University Graduate School \
Guidelines for Electronic Submission of Master's Theses and \
Dissertations. The class should meet all current requirements \
and is updated whenever the university guidelines change. The \
class is based on the memoir document class, and inherits the \
functionality of that class."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0bsvn65462"

RPM_NAME = "texlive-msu-thesis-2023.201.4.0bsvn65462-54.1.noarch.rpm"
RPM_HASH = "eda82c070b87b3c55953f8501929eb6f7dc5f96690768bfa4728ac70d300f5ffbc8476fab9633e785e06b9f82fd8ad11b9095c5a6ba92f385ed258ebc60148d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(msu-thesis.cls) \
texlive-msu-thesis"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etex.sty) \
tex(etoolbox.sty) \
tex(memoir.cls) \
tex(pdflscape.sty) \
tex(textpos.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
