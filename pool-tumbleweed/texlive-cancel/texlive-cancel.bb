SUMMARY = "Place lines through maths formulae"
DESCRIPTION = "A package to draw diagonal lines ('cancelling' a term) and \
arrows with limits (cancelling a term 'to a value') through \
parts of maths formulae."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.2svn32508"

RPM_NAME = "texlive-cancel-2023.209.2.2svn32508-53.1.noarch.rpm"
RPM_HASH = "7d48dc76de84502729757ccbcbac3041e85a3176afacd997b19695c2757c52a5bedc63be6c33e7ca9c0c85b4334e36f90af1658ca22e6b348965e1a49a2b9b2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cancel.sty \
texlive-cancel"

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
