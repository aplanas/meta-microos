SUMMARY = "The Very Short Guide to LaTeX"
DESCRIPTION = "This is a 4-page reminder of what LaTeX does. It is designed \
for printing on A4 paper, double-sided, and folding once to A5. \
Such an 'imposed' version of the document is provided in the \
distribution, as PDF. An analogous version is provided in \
'legal' format."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn55228"

RPM_NAME = "texlive-latex-veryshortguide-2023.201.0.0.7svn55228-55.1.noarch.rpm"
RPM_HASH = "49bc7f003ac10a7667523129084c827bb2699fe6846226c60a19cbb86fac735f220855b61b6d674e1fee8ede97b15ef6d019cca01a401d4b490c58c5ac8ee20a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-veryshortguide"

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
