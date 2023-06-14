SUMMARY = "Iteration in LaTeX"
DESCRIPTION = "The package provides a command \\forloop for doing iteration in \
LaTeX macro programming."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.3.0svn15878"

RPM_NAME = "texlive-forloop-2023.201.3.0svn15878-52.1.noarch.rpm"
RPM_HASH = "3fd2bb5906a7e814c0930d409bb3ee8837f5a07abfd9b9e26b73402672c701f6a9b9e5c3dc4aeae081fce494405f0f01b60a3a5894c8f4e03039acf473147efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-forloop.sty \
texlive-forloop"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
