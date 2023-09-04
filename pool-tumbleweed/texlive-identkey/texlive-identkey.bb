SUMMARY = "Typesetting bracketed dichotomous identification keys"
DESCRIPTION = "The package is for typesetting bracketed dichotomous \
identification keys."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1.0svn61719"

RPM_NAME = "texlive-identkey-2023.209.0.0.1.0svn61719-54.1.noarch.rpm"
RPM_HASH = "b69e01d675d4d71d6cee07a4a933272a2ea06e6fb5e46510dd089861f236b36164e5a1dc7d603de0246409a354f35bbfc9af2afc5fb691c935c1baf577f30c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-identkey.sty \
texlive-identkey"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
