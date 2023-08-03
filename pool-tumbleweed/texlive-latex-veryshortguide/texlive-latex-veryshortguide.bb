SUMMARY = "The Very Short Guide to LaTeX"
DESCRIPTION = "This is a 4-page reminder of what LaTeX does. It is designed \
for printing on A4 paper, double-sided, and folding once to A5. \
Such an 'imposed' version of the document is provided in the \
distribution, as PDF. An analogous version is provided in \
'legal' format."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7svn55228"

RPM_NAME = "texlive-latex-veryshortguide-2023.209.0.0.7svn55228-56.1.noarch.rpm"
RPM_HASH = "aced7a67f01c26b8a3a9728afd8bbeb64b89a702339db9300e606381286eb11e05fd726dd32d47af77e891f7535bdd080aa8d3522baec91674318716aba723aa"
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
