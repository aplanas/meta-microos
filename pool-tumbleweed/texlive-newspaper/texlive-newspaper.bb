SUMMARY = "Typeset newsletters to resemble newspapers"
DESCRIPTION = "The newspaper package redefines the page style and \\maketitle \
command to produce a typeset page similar to that of a \
newspaper. It also provides several commands that (when used \
with other packages) simplify the writing of articles in a \
newspaper-style column format."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-newspaper-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "ecf261c71134324b0ed4e7294df65cdf3e7a7b8c3be1facd7f2401338f11cf3163ca7f2f848adc0ca103bcecaa7b742052568b7ff98bbe95ea4c21bc32422847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newspaper.sty \
texlive-newspaper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-yfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
