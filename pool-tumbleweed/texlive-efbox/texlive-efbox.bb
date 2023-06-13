SUMMARY = "Extension of \\fbox, with controllable frames and colours"
DESCRIPTION = "The package defines the \\efbox command, which creates a box \
just wide enough to hold the text created by its argument. The \
command optionally puts a (possibly partial) frame around the \
box, and allows setting the box background colour."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn33236"

RPM_NAME = "texlive-efbox-2023.201.1.0svn33236-53.1.noarch.rpm"
RPM_HASH = "ae63025911e1368879bd425534779a84f2850d64a849e9127976b1338684a0cbce4f20b27f823463a58925272152b7c778f073f51e64ff3d04f2980fb58df965"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(efbox.sty) \
texlive-efbox"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(pgfkeys.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
