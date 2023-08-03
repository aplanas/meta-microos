SUMMARY = "A LaTeX cheat sheet, in German"
DESCRIPTION = "This is a translation to German of Winston Chang's LaTeX cheat \
sheet (a reference sheet for writing scientific papers). It has \
been adapted to German standards using the KOMA script document \
classes."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn35702"

RPM_NAME = "texlive-latexcheat-de-2023.209.svn35702-55.1.noarch.rpm"
RPM_HASH = "4bf2cbc05128d7fb2f0abe34497939f4267cd3b332b88cd5f3956440d01dfdd4c194e037d50eeec63e3b63d55d8efbc22047e9e8cc77eeab0d30a11aa44351d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcheat-de"

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
