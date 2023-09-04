SUMMARY = "Decorate text with linear gradient colors"
DESCRIPTION = "This package enables writers to conveniently decorate text with \
linear gradient colors. The RGB values of the first and the \
last character are specified as parameters while the rest of \
the text is colored automatically."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn65567"

RPM_NAME = "texlive-gradient-text-2023.209.1.2svn65567-54.2.noarch.rpm"
RPM_HASH = "b27c4880227e2d44ad06c77b7af3c9855211f0aad4e4379c6f5c6a7eea678b5b87b35e54c9cf4e6210005dc790dff56ee311b85333c21521e6f8c2fdbe106bd9"
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
