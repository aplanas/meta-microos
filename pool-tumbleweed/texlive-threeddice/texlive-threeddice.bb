SUMMARY = "Create images of dice with one, two, or three faces showing, using MetaPost"
DESCRIPTION = "The package provides MetaPost code to create all possible \
symmetrical views (up to rotation) of a right-handed die. \
Configuration is possible by editing the source code, following \
the guidance in the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn20675"

RPM_NAME = "texlive-threeddice-2023.201.1.0svn20675-54.1.noarch.rpm"
RPM_HASH = "8afd74c18c08519b97777c2c0cccb6b20ace6103596c19ebb06d32f3c94ffa89dc61702d19eb76cd4395ed1e0e5c567be7b3e738a90d68750a6bfd9e6a8c8c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threeddice"

RDEPENDS:${PN} += "/bin/sh \
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
