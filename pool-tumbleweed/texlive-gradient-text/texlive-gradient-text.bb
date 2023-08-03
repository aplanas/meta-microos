SUMMARY = "Decorate text with linear gradient colors"
DESCRIPTION = "This package enables writers to conveniently decorate text with \
linear gradient colors. The RGB values of the first and the \
last character are specified as parameters while the rest of \
the text is colored automatically."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn65567"

RPM_NAME = "texlive-gradient-text-2023.209.1.2svn65567-54.1.noarch.rpm"
RPM_HASH = "5f788e841fc3c2a49c0b10223fb3187f1de8440fd6d9f8abec130410d4b41877018890f99dd90590ed17dca3194dfc19945e92d9e65ab6b0d7168a763ee25b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gradient-text.sty \
texlive-gradient-text"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
