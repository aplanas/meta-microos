SUMMARY = "XMU thesis style"
DESCRIPTION = "This class is designed for XMU thesis's writing."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn56614"

RPM_NAME = "texlive-xmuthesis-2023.201.0.0.4.1svn56614-52.1.noarch.rpm"
RPM_HASH = "50de57e8047fe6731505c6f01e55e2214fa4976f390a535fb3cb6c7981dca537203c0f7798b47b38ce56dbc553141916c19f91fbf34d5d7ec1f0064e5c5751cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xmulogo.sty) \
tex(xmuthesis.cls) \
texlive-xmuthesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(expl3.sty) \
tex(l3keys2e.sty) \
tex(microtype.sty) \
tex(nag.sty) \
tex(scrlfile.sty) \
tex(tikz.sty) \
tex(unicode-math.sty) \
tex(xcolor.sty) \
tex(xeCJKfntef.sty) \
tex(xparse.sty) \
tex(xtemplate.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
