SUMMARY = "Scary and creepy math symbols with AMS-LaTeX integration"
DESCRIPTION = "The package defines a handful of commands for typesetting \
mathematical symbols of various kinds, ranging from 'large' \
operators to extensible arrow-like relations and growing \
arrow-like math accents that all draw from the classic \
Halloween-related iconography (pumpkins, witches, ghosts, cats, \
and so on) while being, at the same time, seamlessly integrated \
within the rest of the mathematics produced by (AmS-)LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn52602"

RPM_NAME = "texlive-halloweenmath-2023.201.0.0.11svn52602-53.1.noarch.rpm"
RPM_HASH = "a155314deb7309a7ac7ef779fabea51ff84b5c76868af73f0c9b855a55823a629b0ad2395e1fd79f966a10aa2e264d719c9b729628229d6340cef80bd88fd0fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-halloweenmath.sty \
texlive-halloweenmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
