SUMMARY = "Extension of \\fbox, with controllable frames and colours"
DESCRIPTION = "The package defines the \\efbox command, which creates a box \
just wide enough to hold the text created by its argument. The \
command optionally puts a (possibly partial) frame around the \
box, and allows setting the box background colour."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn33236"

RPM_NAME = "texlive-efbox-2023.209.1.0svn33236-54.1.noarch.rpm"
RPM_HASH = "37908cd00e4e39dff7514cdb63405a00a71a56831eedbabeb913c7d00551401ab4b88b94af3dff0b93677e2d3ec35e22c2e6d53a2cd7e23cd487f4d64d4df8e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-efbox.sty \
texlive-efbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
