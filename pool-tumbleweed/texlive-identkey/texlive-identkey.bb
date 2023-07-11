SUMMARY = "Typesetting bracketed dichotomous identification keys"
DESCRIPTION = "The package is for typesetting bracketed dichotomous \
identification keys."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.0.0.1.0svn61719"

RPM_NAME = "texlive-identkey-2023.208.0.0.1.0svn61719-53.1.noarch.rpm"
RPM_HASH = "b30bc068f2bf189b455e20bdaa52d97f079aef6dae3313fbd91707de2ac11fe47cdb40d42817240280c5e8a2a2f6e22a2fe45a1c0313692ef97d8a80510f0849"
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
