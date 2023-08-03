SUMMARY = "Typeset technical and scientific Brazilian documents based on ABNT rules"
DESCRIPTION = "The bundle provides support for typesetting technical and \
scientific Brazilian documents (like academic thesis, articles, \
reports, research project and others) based on the ABNT rules \
(Associacao Brasileira de Normas Tecnicas). It replaces the old \
abntex."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.7svn49248"

RPM_NAME = "texlive-abntex2-2023.209.1.9.7svn49248-55.1.noarch.rpm"
RPM_HASH = "b84df7b9edf8381c4af7bc4a62c7ce99219901e50183d01271962a9db1308f9a4f52caaa625c6c00ba6b1c41e615899a67b95ccb2212bf594c8f7f25c5a0d7bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abntex2.cls \
tex-abntex2abrev.sty \
tex-abntex2cite.sty \
texlive-abntex2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-bookmark.sty \
tex-breakurl.sty \
tex-calc.sty \
tex-enumitem.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-memoir.cls \
tex-relsize.sty \
tex-setspace.sty \
tex-textcase.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
