SUMMARY = "Nomenclature typeset in a longtable"
DESCRIPTION = "Nomentbl typeset nomenclatures in a longtable instead of the \
makeindex style of nomencl. A nomenclature entry may have three \
arguments: Symbol, description and physical unit."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn16549"

RPM_NAME = "texlive-nomentbl-2023.201.0.0.4svn16549-54.1.noarch.rpm"
RPM_HASH = "41b45e15de324db31a2dc9a6fdc03c0b056fdae5212ee5d603a50521806ce5d11e2bc7f73f9479c8a802c274f1bf711d721f262816a8404b22a09bf2331f0e48"
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
