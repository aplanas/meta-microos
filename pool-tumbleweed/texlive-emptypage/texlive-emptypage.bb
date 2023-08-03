SUMMARY = "Make empty pages really empty"
DESCRIPTION = "This package prevents page numbers and headings from appearing \
on empty pages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn18064"

RPM_NAME = "texlive-emptypage-2023.209.1.2svn18064-54.1.noarch.rpm"
RPM_HASH = "37ac34944261f64fc4a90b3256d74c36cf55b56b725be3f64625e73fed2403b228f7f85753be211d77f1fe7255181c5127049471e833b8e7917fdebd37f9ac2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emptypage.sty \
texlive-emptypage"

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
