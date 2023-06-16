SUMMARY = "Modifying the layout of floats"
DESCRIPTION = "The floatrow package provides many ways to customize layouts of \
floating environments and has code to cooperate with the \
caption 3.x package. The package offers mechanisms to put \
floats side by side, and to put the caption beside its float. \
The floatrow settings could be expanded to the floats created \
by packages rotating, wrapfig, subfig (in the case of rows of \
subfloats), and longtable."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3bsvn15878"

RPM_NAME = "texlive-floatrow-2023.201.0.0.3bsvn15878-52.1.noarch.rpm"
RPM_HASH = "960fbcc6b4cbf5891cede5d09173181ecb9f94bb1fb7634817135ee79b69e67bbcf9c9768ae0f179b6ff19f4a864a9d49a55c9bf0d56f72fcfc43f839c2c6371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-floatpagestyle.sty \
tex-floatrow.sty \
tex-fr-fancy.sty \
tex-fr-longtable.sty \
tex-fr-subfig.sty \
tex-listpen.sty \
texlive-floatrow"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption3.sty \
tex-fancybox.sty \
tex-keyval.sty \
tex-longtable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
