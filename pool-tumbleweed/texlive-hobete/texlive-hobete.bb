SUMMARY = "Unofficial beamer theme for the University of Hohenheim"
DESCRIPTION = "The package provides a beamer theme which features the Ci \
colors of the University of Hohenheim. Please note that this is \
not an official Theme, and that there will be no support for \
it, from the University. Furthermore there is NO relationship \
between the University and this theme."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn27036"

RPM_NAME = "texlive-hobete-2023.209.svn27036-54.2.noarch.rpm"
RPM_HASH = "e0f50e932a05a2dbe5e52c02e402f828ed542f768cb7ede4ce787d67fe1a71a19c79ce09afa9a46d03a8b53dd7eadd53214eb1887936d8500040b0d9f5a75331"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemehohenheim.sty \
tex-beamerouterthemehohenheim.sty \
tex-beamerouterthemehohenheimposter.sty \
tex-beamerthemehohenheim.sty \
tex-hobete.sty \
texlive-hobete"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-xfrac.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
