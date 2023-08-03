SUMMARY = "Drawing (linguistic) trees"
DESCRIPTION = "The package provides a PGF/TikZ-based mechanism for drawing \
linguistic (and other kinds of) trees. Its main features are: a \
packing algorithm which can produce very compact trees; a \
user-friendly interface consisting of the familiar bracket \
encoding of trees plus the key-value interface to \
option-setting; many tree-formatting options, with control over \
option values of individual nodes and mechanisms for their \
manipulation; the possibility to decorate the tree using the \
full power of PGF/TikZ; and an externalization mechanism \
sensitive to code-changes."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.5svn57398"

RPM_NAME = "texlive-forest-2023.209.2.1.5svn57398-53.1.noarch.rpm"
RPM_HASH = "08a1db245a9b7a8cad8f31401858f248d8f488920d7640fb8a738040bc4778b6d759994b2a79414a9f8b284f3ef3a2d470f3fd7c73fa47f2a4fc6efe9ddd0583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-forest-compat.sty \
tex-forest-doc.sty \
tex-forest-index.sty \
tex-forest-lib-edges.sty \
tex-forest-lib-linguistics.sty \
tex-forest.sty \
texlive-forest"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-dingbat.sty \
tex-elocalloc.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-inlinedef.sty \
tex-lstdoc.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-elocalloc \
texlive-environ \
texlive-etoolbox \
texlive-filesystem \
texlive-inlinedef \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3packages \
texlive-pgf \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
