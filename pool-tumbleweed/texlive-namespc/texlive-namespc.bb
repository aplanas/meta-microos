SUMMARY = "Rudimentary C++-like namespaces in LaTeX"
DESCRIPTION = "The namespc package adds rudimentary C++-like namespace \
functionality to LaTeX. It may be used to declare local LaTeX \
commands, which can be made accessible in a later contexts \
without defining them globally."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-namespc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "e2ef3297d405ede75467f565960152df6815eaadbe93279f300ed1b3b6389d8b06a462b8afef1226aa856d25c988a5812d1ba88b9fde5514a22ad737cd8dcc09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(namespc.sty) \
texlive-namespc"
RDEPENDS:${PN} += "/bin/sh \
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
