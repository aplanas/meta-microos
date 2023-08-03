SUMMARY = "Extension of the CJK package for Korean typesetting"
DESCRIPTION = "The package supports typesetting UTF-8-encoded modern Korean \
documents with the help of the LaTeX2e CJK package. It provides \
some enhanced features focused on Korean typesetting culture, \
one of them being allowing line-break between Latin and CJK \
characters. The package requires nanumtype1 fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.3svn63561"

RPM_NAME = "texlive-cjk-ko-2023.209.2.3svn63561-54.1.noarch.rpm"
RPM_HASH = "0680ad1c71281333f1e24840199e61f3e7814c1c60251c8b6a95a67126d49b2bd4fc5e1c1168471c2371fa1b85226c0be49f958369306528b0eaa6785ab2ab84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cjkutf8-josa.sty \
tex-cjkutf8-ko.sty \
tex-cjkutf8-nanummjhanja.sty \
tex-kolabels-utf.sty \
tex-konames-utf.sty \
tex-kotex.sty \
texlive-cjk-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJKfntef.sty \
tex-CJKutf8.sty \
tex-kotexutf.sty \
tex-luatexko.sty \
tex-ulem.sty \
tex-xetexko.sty \
texlive \
texlive-cjk \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
