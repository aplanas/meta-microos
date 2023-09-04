SUMMARY = "Print vectors, matrices, and tensors"
DESCRIPTION = "This package provides commands for vectors, matrices, and \
tensors with different styles -- arrows (as the LaTeX default), \
underlined, and bold."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.61svn54080"

RPM_NAME = "texlive-hhtensor-2023.209.0.0.61svn54080-54.2.noarch.rpm"
RPM_HASH = "cc819b4e2b36b8378de1c6665a6f7a0e813df3e270126a0df1487a43ba9a4554d7dff72beb1ba64c659eda1c80e4ca3342c9ed537dc5deaaca335764bbb790b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hhtensor.sty \
texlive-hhtensor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-ushort.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
