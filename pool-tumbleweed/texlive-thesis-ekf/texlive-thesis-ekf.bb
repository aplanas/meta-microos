SUMMARY = "Thesis class for Eszterhazy Karoly Catholic University"
DESCRIPTION = "This is a class file for theses and dissertations at the \
Eszterhazy Karoly Catholic University (Eger, Hungary). The \
documentation is in Hungarian."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn60228"

RPM_NAME = "texlive-thesis-ekf-2023.209.4.2svn60228-55.1.noarch.rpm"
RPM_HASH = "0efe7816af14478e4df81b9598318ea9539357dcd146ffe0c5ab01f55024ee9faeba2babff762b7eed06bfe44342192cb0ab517f877a5268346711c51e7d5f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thesis-ekf.cls \
texlive-thesis-ekf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmap.sty \
tex-cmupint.sty \
tex-etoolbox.sty \
tex-fixcmex.sty \
tex-fontsize.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-kvoptions.sty \
tex-lmodern.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-report.cls \
tex-setspace.sty \
tex-upquote.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
