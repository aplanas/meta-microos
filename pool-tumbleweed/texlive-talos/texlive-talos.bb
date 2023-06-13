SUMMARY = "A Greek cult font from the eighties"
DESCRIPTION = "A cult Greek font from the eighties, used at the University of \
Crete, Greece. It belonged to the first TeX installation in a \
Greek University and most probably the first TeX installation \
that supported the Greek language."
LICENSE = "LPPL-1.3c"

PV = "2023.201.1.0svn61820"

RPM_NAME = "texlive-talos-2023.201.1.0svn61820-54.1.noarch.rpm"
RPM_HASH = "426ffdd42a2047e1c6a503e87cd2412608bf69d0887b1b98b9aec43eb9a8f3ce9fdb04022ec3526cf3ee54720e60f2f5375f994ef1ea5bdc27bab076bac8f769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-talos"

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
texlive-scripts-bin \
texlive-talos-fonts"

inherit rpm
