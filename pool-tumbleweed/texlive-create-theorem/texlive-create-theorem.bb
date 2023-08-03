SUMMARY = "Multilingual support for theorem-like environments"
DESCRIPTION = "This package provides commands for naming, initializing and \
configuring theorem-like environments. These commands have \
key-value based interfaces and are especially useful in \
multilingual documents, allowing the easy declaration of \
theorem-like environments that can automatically adapt to the \
language settings."
LICENSE = "LPPL-1.0"

PV = "2023.209.20220808asvn64104"

RPM_NAME = "texlive-create-theorem-2023.209.20220808asvn64104-55.1.noarch.rpm"
RPM_HASH = "74301b64ce333ae772483a10e1d2d0c495633a95990cf261c885c1a85656ed5e780a68b15f519d5c416c10fcbcd2ba730ef0543ad4b7a2d65e136fdde26a2868"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-create-theorem.sty \
texlive-create-theorem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-crefthe.sty \
texlive \
texlive-crefthe \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
