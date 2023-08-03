SUMMARY = "French translation of the documentation of Tabbing"
DESCRIPTION = "A translation to French (by the author) of the documentation of \
the Tabbing package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24228"

RPM_NAME = "texlive-translation-tabbing-fr-2023.209.svn24228-53.1.noarch.rpm"
RPM_HASH = "67e62bb572313459df94800f54aeeb100ac209b44069ba8c10311bb1c8338304b809b85b575fda08ff313057a6c3d889ba840bbcc3dabe21189a2cc870b5e4a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-tabbing-fr"

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
