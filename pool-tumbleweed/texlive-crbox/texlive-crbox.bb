SUMMARY = "Boxes with crossed corners"
DESCRIPTION = "The package implements a \\crbox command which produces boxes \
with crossing lines at the corners."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29803"

RPM_NAME = "texlive-crbox-2023.209.0.0.1svn29803-55.1.noarch.rpm"
RPM_HASH = "89b458623a27abb1c2c1a495fcb1006bfbd7f4d41a3239919d70afa23b95a42746cfbefc3ed1d355d0b816dad94a6fea2154f9c4fcf7e467c9506bd647c9bc42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-crbox.sty \
texlive-crbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
