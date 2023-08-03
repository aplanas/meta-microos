SUMMARY = "Nomenclature typeset in a longtable"
DESCRIPTION = "Nomentbl typeset nomenclatures in a longtable instead of the \
makeindex style of nomencl. A nomenclature entry may have three \
arguments: Symbol, description and physical unit."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn16549"

RPM_NAME = "texlive-nomentbl-2023.209.0.0.4svn16549-55.1.noarch.rpm"
RPM_HASH = "02f6346463bf049db7747b81074378445123e06d77559850bbcc1a3c0ca3c4a6927b4c9758c0e7d620863c433c745b47ff01e2cdea90e3420d04bbacc540937a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nomentbl.sty \
texlive-nomentbl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-calc.sty \
tex-ifthen.sty \
tex-longtable.sty \
tex-nomencl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
