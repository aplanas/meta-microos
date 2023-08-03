SUMMARY = "University of Southampton-compliant slides"
DESCRIPTION = "The bundle contains two packages: soton-palette which defines \
colour-ways, and soton-beamer, which uses the colours to \
produce compliant presentations."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn16215"

RPM_NAME = "texlive-soton-2023.209.0.0.1svn16215-58.1.noarch.rpm"
RPM_HASH = "27744ed80181340d1ce7746d42883a99c304cc1334e0ffcda53a3a99f97d6478ba536f5b84f2cbfadb09d13fbc1ad4da6822820e9c1d83cb5339b5e37c224a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-soton-beamer.sty \
tex-soton-palette.sty \
texlive-soton"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
