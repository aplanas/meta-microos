SUMMARY = "Create fancy boxed ((sub)sub)sections"
DESCRIPTION = "Sectionbox is a LaTeX package for putting fancy colored boxes \
around sections, subsections, and subsubsections, especially \
for use in posters, etc. It was designed with the sciposter \
class in mind, and certainly works with that class and with \
derived classes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn37749"

RPM_NAME = "texlive-sectionbox-2023.209.1.01svn37749-54.1.noarch.rpm"
RPM_HASH = "20eb5394f9db21be0b5b9384d186aea1b01fe826112cc46026b8c61959bd1970e354893930fd1f634baf5fbf984de94a065588e9b2584de6d6097cfb76d38a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sectionbox.sty \
texlive-sectionbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.sty \
tex-fancybox.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
