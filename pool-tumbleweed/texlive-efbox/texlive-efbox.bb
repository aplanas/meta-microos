SUMMARY = "Extension of \\fbox, with controllable frames and colours"
DESCRIPTION = "The package defines the \\efbox command, which creates a box \
just wide enough to hold the text created by its argument. The \
command optionally puts a (possibly partial) frame around the \
box, and allows setting the box background colour."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn33236"

RPM_NAME = "texlive-efbox-2023.209.1.0svn33236-54.2.noarch.rpm"
RPM_HASH = "7732097c7898ec2ff2303513b0a0b8e3a53032194d2978a6480ca7505e98495f669879363f750a0412eb19c2269a89b33372d1482ed4e27a6b2c409c9cb2cb30"
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
