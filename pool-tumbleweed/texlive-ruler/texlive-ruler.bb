SUMMARY = "A typographic ruler for TeX"
DESCRIPTION = "The file processes to produce (real) rulers; the author \
suggests printing them on transparent plastic and trimming for \
use as a 'real' ruler. The rule widths are 0.05mm, which can be \
challenging for (old) laser printers."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn54251"

RPM_NAME = "texlive-ruler-2023.209.1.1svn54251-54.1.noarch.rpm"
RPM_HASH = "987f6787e351b0a4a67d6e601aeff33ff7fd2a7eabc708e7dbe55ba97d647c9a40b35a78e936f9e371d26b133a0af54660cfd995da620a9384b05f47435cf498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ruler.tex \
texlive-ruler"

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
