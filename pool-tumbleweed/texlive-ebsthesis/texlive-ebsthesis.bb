SUMMARY = "Typesetting theses for economics"
DESCRIPTION = "The ebsthesis class and ebstools package facilitate the \
production of camera-ready manuscripts in conformance with the \
guidelines of Gabler Verlag and typographical rules established \
by the European Business School."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-ebsthesis-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "59e5d99a2a4e3d948e15506c15562fe13ce4809db9bd40960abc39867b6f82baba5ce77795eb0c839c45241b80256a706032f26ba5529940a05f89a481da8be9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ebsthesis.cls \
texlive-ebsthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-acronym.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-calc.sty \
tex-caption.sty \
tex-comment.sty \
tex-dsfont.sty \
tex-extbook.cls \
tex-geometry.sty \
tex-ifthen.sty \
tex-mdwlist.sty \
tex-nomencl.sty \
tex-onlyamsmath.sty \
tex-ragged2e.sty \
tex-remreset.sty \
tex-rotfloat.sty \
tex-setspace.sty \
tex-titletoc.sty \
tex-tocbibind.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
