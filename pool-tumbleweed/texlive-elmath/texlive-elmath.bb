SUMMARY = "Mathematics in Greek texts"
DESCRIPTION = "This package has been designed to facilitate the use of Greek \
letters in mathematical mode. The package allows one to \
directly type in Greek letters (in ISO 8859-7 encoding) in math \
mode."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-elmath-2023.201.1.2svn15878-53.2.noarch.rpm"
RPM_HASH = "6b46a8259849a4334f997a3cbc06dbc6d2bc779658272555513da1ee6e419810cb6c82f207a68865501f54a2408e6e96c57258de9225a8670c2bba1f9cce9eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elmath.sty \
texlive-elmath"

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
