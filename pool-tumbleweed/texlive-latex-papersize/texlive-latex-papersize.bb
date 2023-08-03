SUMMARY = "Calculate LaTeX settings for any font and paper size"
DESCRIPTION = "The package is a Python script, whose typical use is when \
preparing printed material for users with low vision. The most \
effective way of doing this is to print on (notional) small \
paper, and then to magnify the result; the script calculates \
the settings for various font and paper sizes. More details are \
to be read in the script itself."
LICENSE = "Apache-1.0"

PV = "2023.209.1.63svn53131"

RPM_NAME = "texlive-latex-papersize-2023.209.1.63svn53131-56.1.noarch.rpm"
RPM_HASH = "7ade9e18d4d7ee68853d8fb06840e30740e874de06e58c56eb77f19525827a3211b00337d028bced57b952fbbf43c60a92c8a1fdfd952466bacba26a16b6f63e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-papersize"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex-papersize-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
