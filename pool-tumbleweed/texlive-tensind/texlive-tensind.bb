SUMMARY = "Typeset tensors"
DESCRIPTION = "Typesets tensors with dots filling gaps and fine tuning of \
index placement."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn51481"

RPM_NAME = "texlive-tensind-2023.201.1.1svn51481-54.1.noarch.rpm"
RPM_HASH = "8cca7774a011de578796d158facc0dda5054f1f4aafec8310f7133785c32ba9578eab2944192425f95ea1e6c3b033acd3ebde10c699b2c600f4cdb462cfc8217"
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
