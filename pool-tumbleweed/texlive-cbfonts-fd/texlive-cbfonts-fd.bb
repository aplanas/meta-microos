SUMMARY = "LaTeX font description files for the CB Greek fonts"
DESCRIPTION = "The package provides font description files for all the many \
shapes available from the cbfonts collection. The files provide \
the means whereby the NFSS knows which fonts a LaTeX user is \
requesting. The package depends on cbgreek-complete."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn54080"

RPM_NAME = "texlive-cbfonts-fd-2023.209.1.2svn54080-53.1.noarch.rpm"
RPM_HASH = "d995487bea5278eac7d96e68acda36664c5d964ef591e27846c70d3e6335563db10880278aab0fe1812325d0c084c8275f68cad46a1eb5e5a1032f90a23857b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lgrcmr.fd \
tex-lgrcmro.fd \
tex-lgrcmss.fd \
tex-lgrcmtt.fd \
tex-lgrlcmss.fd \
tex-lgrlcmtt.fd \
tex-lgrlmr.fd \
tex-lgrlmro.fd \
tex-lgrlmss.fd \
tex-lgrlmtt.fd \
texlive-cbfonts-fd"

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
