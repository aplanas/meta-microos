SUMMARY = "Multilingual support for theorem-like environments"
DESCRIPTION = "This package provides commands for naming, initializing and \
configuring theorem-like environments. These commands have \
key-value based interfaces and are especially useful in \
multilingual documents, allowing the easy declaration of \
theorem-like environments that can automatically adapt to the \
language settings."
LICENSE = "LPPL-1.0"

PV = "2023.204.20220808asvn64104"

RPM_NAME = "texlive-create-theorem-2023.204.20220808asvn64104-54.1.noarch.rpm"
RPM_HASH = "9ec15fdb009bd4527506871bc6ad2fadc12d827a5a31dfe0b1b295eb09c1ebab02510eb201d9b827a41b60dc14f9be7475079ff501627fb18b75734153d2e009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-create-theorem.sty \
texlive-create-theorem"

RDEPENDS:${PN} += "/bin/sh \
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
