SUMMARY = "Extension of \\fbox, with controllable frames and colours"
DESCRIPTION = "The package defines the \\efbox command, which creates a box \
just wide enough to hold the text created by its argument. The \
command optionally puts a (possibly partial) frame around the \
box, and allows setting the box background colour."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn33236"

RPM_NAME = "texlive-efbox-2023.201.1.0svn33236-53.2.noarch.rpm"
RPM_HASH = "c0fbd15dcbc15b4eea34720ece5516722dd2ed9c20cdc14b79da099fa27ea24926a45a27e2202a810129f4c9143da283b68f15f830b76d86e01fe7d713c04f34"
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
