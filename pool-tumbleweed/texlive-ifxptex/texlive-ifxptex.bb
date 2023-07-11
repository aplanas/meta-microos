SUMMARY = "Detect pTeX and its derivatives"
DESCRIPTION = "The package provides commands for detecting pTeX and its \
derivatives (e-pTeX, upTeX, e-upTeX, and ApTeX). Both LaTeX and \
plain TeX are supported."
LICENSE = "SUSE-TeX"

PV = "2023.208.0.0.2svn46153"

RPM_NAME = "texlive-ifxptex-2023.208.0.0.2svn46153-53.1.noarch.rpm"
RPM_HASH = "b4144a62436a53b139d4f842d1ba748ee8e09c2627d995d40ed18536307f1ba65d7692a950c602315392ddf6ec68798f49a2b5790193be4b15a346a4a918ebcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifxptex.sty \
texlive-ifxptex"

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
