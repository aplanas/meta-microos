SUMMARY = "Babel contributed support for Basque"
DESCRIPTION = "The package establishes Basque conventions in a document."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0fsvn30256"

RPM_NAME = "texlive-babel-basque-2023.201.1.0fsvn30256-53.1.noarch.rpm"
RPM_HASH = "646c2dd6abcdba376582577276e7c1d76702147731de410ed21bb585369ded5785b3ef734d80fe3c9d2975e60be2e6848c37141a4ef0080fb3116448767601b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-basque.ldf \
texlive-babel-basque"

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
