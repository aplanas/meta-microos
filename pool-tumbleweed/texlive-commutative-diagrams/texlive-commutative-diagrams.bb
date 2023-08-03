SUMMARY = "CoDi: Commutative Diagrams for TeX"
DESCRIPTION = "This package provides a TikZ library for making commutative \
diagrams easy to design, parse and tweak."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn55526"

RPM_NAME = "texlive-commutative-diagrams-2023.209.1.0.1svn55526-54.1.noarch.rpm"
RPM_HASH = "6ec0211c58827f2fed48fd0a0dc12abdec0f86f043fbd858f80e2c291db09a5adb01002611caead0cf71cdb945d0306079baf0e18eaf344577acbba1cea9b3e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-commutative-diagrams.sty \
tex-commutative-diagrams.tex \
tex-kodi.sty \
tex-t-commutative-diagrams.tex \
tex-tikzlibrarycommutative-diagrams.bapto.code.tex \
tex-tikzlibrarycommutative-diagrams.code.tex \
tex-tikzlibrarycommutative-diagrams.diorthono.code.tex \
tex-tikzlibrarycommutative-diagrams.ektropi.code.tex \
tex-tikzlibrarycommutative-diagrams.katharizo.code.tex \
tex-tikzlibrarycommutative-diagrams.koinos.code.tex \
tex-tikzlibrarycommutative-diagrams.mandyas.code.tex \
tex-tikzlibrarycommutative-diagrams.mitra.code.tex \
tex-tikzlibrarycommutative-diagrams.ozos.code.tex \
tex-tikzlibrarycommutative-diagrams.ramma.code.tex \
tex-tikzlibrarycommutative-diagrams.velos.code.tex \
texlive-commutative-diagrams"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
