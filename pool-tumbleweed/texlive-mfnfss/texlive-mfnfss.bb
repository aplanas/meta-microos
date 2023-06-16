SUMMARY = "Packages to typeset oldgerman and pandora fonts in LaTeX"
DESCRIPTION = "This bundle contains two packages: - oldgerm, a package to \
typeset with old german fonts designed by Yannis Haralambous. - \
pandora, a package to typeset with Pandora fonts designed by \
Neena Billawala. Note that support for the Pandora fonts is \
also available via the pandora-latex package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46036"

RPM_NAME = "texlive-mfnfss-2023.201.svn46036-54.1.noarch.rpm"
RPM_HASH = "c211b97e7982e22206eed2834914c40b1faf1f89fe169de993d0d2bf6f7ee8b9beccf381eca3a57f4d777e5f2a213f956d3aa94cb8a448c1f8f8452aca924ad1"
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
