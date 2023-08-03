SUMMARY = "Construct dichotomous identification keys"
DESCRIPTION = "The package can be used to construct dichotomous identification \
keys (used especially in biology for species identification), \
taking care of numbering and indentation of successive key \
steps automatically. An example file is provided, which \
demonstrates usage."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17192"

RPM_NAME = "texlive-dichokey-2023.209.svn17192-53.1.noarch.rpm"
RPM_HASH = "8832289b3de835a001ab6bbc5c77c98913281a028f8f79145137ed4d3b3bf0762e4a072bcdbc954797d11a9a31a445b81337551972376ce61041040f03c66735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dichokey.sty \
texlive-dichokey"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
