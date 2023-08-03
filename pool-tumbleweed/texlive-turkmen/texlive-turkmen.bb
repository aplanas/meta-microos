SUMMARY = "Babel support for Turkmen"
DESCRIPTION = "The package provides support for Turkmen in babel, but \
integration with babel is not available."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn17748"

RPM_NAME = "texlive-turkmen-2023.209.0.0.2svn17748-53.1.noarch.rpm"
RPM_HASH = "28d31da89f259b86b191fcf1f41d7026b4a5cd9432ae820a2a480baf21b33a8fa8f0460eaa33297f6a8a83b672a2d2b82107fe3824e402a23baaacd9830000ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turkmen.ldf \
texlive-turkmen"

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
