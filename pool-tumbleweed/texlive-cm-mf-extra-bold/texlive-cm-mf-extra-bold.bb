SUMMARY = "Extra Metafont files for CM"
DESCRIPTION = "The bundle provides bold versions of cmcsc, cmex, cmtex and \
cmtt fonts (all parts of the standard computer modern font \
distribution), as Metafont base files."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-cm-mf-extra-bold-2023.201.svn54512-53.1.noarch.rpm"
RPM_HASH = "aad0f5a84b95ad2ce761c817fc38b4c16cdea67ac11b2e9cb756cf97d8631b1f096eb84162048dd5f8a5b3b764236f2973507cdadf8edd542b42c3772096b389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmbcsc10.tfm \
tex-cmbtex10.tfm \
tex-cmbtt10.tfm \
tex-cmbtt8.tfm \
tex-cmbtt9.tfm \
tex-cmttb10.tfm \
texlive-cm-mf-extra-bold"

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
