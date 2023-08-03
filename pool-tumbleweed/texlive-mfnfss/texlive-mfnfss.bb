SUMMARY = "Packages to typeset oldgerman and pandora fonts in LaTeX"
DESCRIPTION = "This bundle contains two packages: - oldgerm, a package to \
typeset with old german fonts designed by Yannis Haralambous. - \
pandora, a package to typeset with Pandora fonts designed by \
Neena Billawala. Note that support for the Pandora fonts is \
also available via the pandora-latex package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46036"

RPM_NAME = "texlive-mfnfss-2023.209.svn46036-55.1.noarch.rpm"
RPM_HASH = "86ac243d58bd917065e0f95d4a18b7390aa94ca97f8e11a16f17d9fa9cf05d483d155af9e73dae1113ea85dd5d2f6427103ea15b93becee6efc86cacdfbe61b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-oldgerm.sty \
tex-ot1panr.fd \
tex-ot1pss.fd \
tex-pandora.sty \
tex-uyfrak.fd \
tex-uygoth.fd \
tex-uyinit.fd \
tex-uyswab.fd \
texlive-mfnfss"

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
