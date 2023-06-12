SUMMARY = "Extension of the CJK package for Korean typesetting"
DESCRIPTION = "The package supports typesetting UTF-8-encoded modern Korean \
documents with the help of the LaTeX2e CJK package. It provides \
some enhanced features focused on Korean typesetting culture, \
one of them being allowing line-break between Latin and CJK \
characters. The package requires nanumtype1 fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.3svn63561"

RPM_NAME = "texlive-cjk-ko-2023.201.2.3svn63561-53.1.noarch.rpm"
RPM_HASH = "f66519af4b5c02163f67433336214c493c9a8f262dabf736ba1946bee9e0e331b7512cb60ef2aa3a9df5af3144ce41c87545d71030f54ffbd4c452c96bb5f465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cjkutf8-josa.sty) \
tex(cjkutf8-ko.sty) \
tex(cjkutf8-nanummjhanja.sty) \
tex(kolabels-utf.sty) \
tex(konames-utf.sty) \
tex(kotex.sty) \
texlive-cjk-ko"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(CJKfntef.sty) \
tex(CJKutf8.sty) \
tex(kotexutf.sty) \
tex(luatexko.sty) \
tex(ulem.sty) \
tex(xetexko.sty) \
texlive \
texlive-cjk \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
