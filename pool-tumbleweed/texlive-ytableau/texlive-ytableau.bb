SUMMARY = "Many-featured Young tableaux and Young diagrams"
DESCRIPTION = "The package provides several functions for drawing Young \
tableaux and Young diagrams, extending the young and youngtab \
packages but providing lots more features. Skew and coloured \
tableaux are easy, and pgfkeys-enabled options are provided \
both at package load and configurably."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn59580"

RPM_NAME = "texlive-ytableau-2023.209.1.4svn59580-53.2.noarch.rpm"
RPM_HASH = "bc7b180dbd636092b35386e3ef08ff04ba6ceec7f751ce778407ed01771a6dd7e74b8900e5fd6891f65a761d9d06efc2fdd5e99b9c6add8cc24cd06c506102cc"
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
