SUMMARY = "Detect pTeX and its derivatives"
DESCRIPTION = "The package provides commands for detecting pTeX and its \
derivatives (e-pTeX, upTeX, e-upTeX, and ApTeX). Both LaTeX and \
plain TeX are supported."
LICENSE = "SUSE-TeX"

PV = "2023.209.0.0.2svn46153"

RPM_NAME = "texlive-ifxptex-2023.209.0.0.2svn46153-54.1.noarch.rpm"
RPM_HASH = "69618cf9fc78170cf6a1f36edf8fca6d07584fb8ffdfb9ff992a706869c3e5f0310f421323fc0ec1f06392ba9a652a4006c802ff21cc2aa26a414b6b6ca113be"
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
