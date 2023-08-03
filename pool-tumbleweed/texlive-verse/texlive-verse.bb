SUMMARY = "Aids for typesetting simple verse"
DESCRIPTION = "The package documentation discusses approaches to the problem; \
the package is strong on layout, from simple alternate-line \
indentation to the Mouse's tale from Alice in Wonderland."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4bsvn34017"

RPM_NAME = "texlive-verse-2023.209.2.4bsvn34017-54.1.noarch.rpm"
RPM_HASH = "1fe18a55de634424aa0540bafc2e96347023f2216f57b1dc915d5b2984912edc3b34573536c9f2c54452e5a10bacd6ad3252fbe3c3a11e5c9330ec7c55eb15fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verse.sty \
texlive-verse"

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
