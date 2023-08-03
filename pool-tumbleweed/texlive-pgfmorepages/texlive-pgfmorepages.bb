SUMMARY = "Assemble multiple logical pages onto a physical page"
DESCRIPTION = "This package replaces and extends the pgfpages sub-package of \
the PGF system. It provides the capability to arrange multiple \
'logical' pages on multiple 'physical' pages, for example as \
for arranging pages to make booklets."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn54770"

RPM_NAME = "texlive-pgfmorepages-2023.209.1.20svn54770-52.1.noarch.rpm"
RPM_HASH = "31d1c99e13d09b94aceeb8492cfef300a629f408e781da665282e481c1125eec7b925c0039a14c26b7399dbe74e3800bad8a185ff4375ab54447fc12205bedb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfmorepages.sty \
tex-pgfmorepageslayouts.code.tex \
texlive-pgfmorepages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-pgfcore.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
