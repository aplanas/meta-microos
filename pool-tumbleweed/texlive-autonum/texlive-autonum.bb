SUMMARY = "Automatic equation references"
DESCRIPTION = "The package arranges that equation numbers are applied only to \
those equations that are referenced. This operation is similar \
to the showonlyrefs option of the package mathtools."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.11svn36084"

RPM_NAME = "texlive-autonum-2023.209.0.0.3.11svn36084-54.1.noarch.rpm"
RPM_HASH = "b87df969a61fb2b2d8effa9c48f65d23a36355a363d7ac3fbb00a26ef7a6abb72f5efac7362df6de1133371a985ddd31bdedbd31225663936e1b3ef68e43a394"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autonum.sty \
texlive-autonum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-etextools.sty \
tex-etoolbox.sty \
tex-letltxmacro.sty \
tex-textpos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
