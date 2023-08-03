SUMMARY = "Typeset tensors"
DESCRIPTION = "Typesets tensors with dots filling gaps and fine tuning of \
index placement."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn51481"

RPM_NAME = "texlive-tensind-2023.209.1.1svn51481-55.1.noarch.rpm"
RPM_HASH = "933a1f093f4413605d0925ceb19c74bf2d8b050bc68fdc3b16bda5c6c801cd4e06ba428b1e151129803208caad53e0bf501609506a1d0b1b54a3447b1b78c4bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tensind.sty \
texlive-tensind"

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
