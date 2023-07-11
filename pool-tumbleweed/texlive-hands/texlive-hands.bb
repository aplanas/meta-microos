SUMMARY = "Pointing hand font"
DESCRIPTION = "Provides right- and left-pointing hands in both black-on-white \
and white-on-black realisation. The font is distributed as \
Metafont source."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn13293"

RPM_NAME = "texlive-hands-2023.201.svn13293-53.2.noarch.rpm"
RPM_HASH = "5dac9b6486f85eb0c0fa1dd0ee151292d80980d6cc23942d57b8c69a728766bb2df18dea308640f69dd4803b9906c093fc97cce1b57569ceb777fed342ba7f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hands.tfm \
texlive-hands"

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
