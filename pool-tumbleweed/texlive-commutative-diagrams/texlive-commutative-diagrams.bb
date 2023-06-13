SUMMARY = "CoDi: Commutative Diagrams for TeX"
DESCRIPTION = "This package provides a TikZ library for making commutative \
diagrams easy to design, parse and tweak."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn55526"

RPM_NAME = "texlive-commutative-diagrams-2023.201.1.0.1svn55526-53.1.noarch.rpm"
RPM_HASH = "cc26bdf7c66fd1cad33e915296fc1df289f33f6b2fee02ab6cd7deab669e269c77fc620eededebb9d9db271886b7263aa23bf62222078265824244c65852d148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(commutative-diagrams.sty) \
tex(commutative-diagrams.tex) \
tex(kodi.sty) \
tex(t-commutative-diagrams.tex) \
tex(tikzlibrarycommutative-diagrams.bapto.code.tex) \
tex(tikzlibrarycommutative-diagrams.code.tex) \
tex(tikzlibrarycommutative-diagrams.diorthono.code.tex) \
tex(tikzlibrarycommutative-diagrams.ektropi.code.tex) \
tex(tikzlibrarycommutative-diagrams.katharizo.code.tex) \
tex(tikzlibrarycommutative-diagrams.koinos.code.tex) \
tex(tikzlibrarycommutative-diagrams.mandyas.code.tex) \
tex(tikzlibrarycommutative-diagrams.mitra.code.tex) \
tex(tikzlibrarycommutative-diagrams.ozos.code.tex) \
tex(tikzlibrarycommutative-diagrams.ramma.code.tex) \
tex(tikzlibrarycommutative-diagrams.velos.code.tex) \
texlive-commutative-diagrams"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
