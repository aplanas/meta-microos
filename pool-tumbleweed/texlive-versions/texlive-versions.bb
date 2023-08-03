SUMMARY = "Optionally omit pieces of text"
DESCRIPTION = "Stephan Bellantoni's version has provided preamble commands for \
selecting environments to be included/excluded. This package \
does the same, but corrects, improves, and extends it in both \
implementation and function."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.55svn21921"

RPM_NAME = "texlive-versions-2023.209.0.0.55svn21921-54.1.noarch.rpm"
RPM_HASH = "8443575d13f16ee869ade14c2e1d5e89dff858351af3ef0553e688f6f69027d19e67de91a443f0b4b241f62a6f92a67b3db94838c7f522aacf24f8bbf709a0c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-versions.sty \
texlive-versions"

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
