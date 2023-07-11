SUMMARY = "Many-featured Young tableaux and Young diagrams"
DESCRIPTION = "The package provides several functions for drawing Young \
tableaux and Young diagrams, extending the young and youngtab \
packages but providing lots more features. Skew and coloured \
tableaux are easy, and pgfkeys-enabled options are provided \
both at package load and configurably."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn59580"

RPM_NAME = "texlive-ytableau-2023.201.1.4svn59580-52.2.noarch.rpm"
RPM_HASH = "1284bec903e8a553819ff0db72d60d33feab8522490b8aeebdbc272e27ef63ef91a949fb7360acb9f26b08d0f9185f822f59774e8257504bce710616ba7d6069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ytableau.sty \
texlive-ytableau"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
