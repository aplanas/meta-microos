SUMMARY = "Examples and more from Guide to LaTeX, by Kopka and Daly"
DESCRIPTION = "The guide-to-latex package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45712"

RPM_NAME = "texlive-guide-to-latex-2023.209.svn45712-54.2.noarch.rpm"
RPM_HASH = "46a4e31ee295ef679436426eb6b2770ad8db33fa2d3523cc8fc9ea0097a5b5b5e869f9372bbaaaf0ea68ac11a57402f656918f21f4f1df78e22decac0f61701d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guide-to-latex"

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
