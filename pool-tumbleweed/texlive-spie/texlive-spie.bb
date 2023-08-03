SUMMARY = "Support for formatting SPIE Proceedings manuscripts"
DESCRIPTION = "A class and a BibTeX style are provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.25svn15878"

RPM_NAME = "texlive-spie-2023.209.3.25svn15878-58.1.noarch.rpm"
RPM_HASH = "cb7fb7de3f59f424185fedcb70c3ba4eca677c9fda1f516e558ac859a60bbd48f1865a3998dde72be92fac90f6b8e40d187a768da674a93db03d372868baa2a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spie.cls \
texlive-spie"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cite.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
