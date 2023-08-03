SUMMARY = "Simple Wick contractions"
DESCRIPTION = "The package provides a simple means of drawing Wick \
contractions above and below expressions."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2asvn15878"

RPM_NAME = "texlive-simplewick-2023.209.1.2asvn15878-54.1.noarch.rpm"
RPM_HASH = "184bd1e8862202605afb9600558778364dffd06c35883c9999265547216fdd5a71820a10816f176c3c9ca652043f2931d3b616cd121cb8f8e90796d84fac102b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplewick.sty \
texlive-simplewick"

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
