SUMMARY = "Define textual variants"
DESCRIPTION = "The package provides commands to formalize textual variants in \
critical editions typeset using eledmac."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn38114"

RPM_NAME = "texlive-eledform-2023.209.1.1asvn38114-54.2.noarch.rpm"
RPM_HASH = "000789339beebb388f7facb43d9e018c84d95d7e3495795f4e5528f8e962ada9ab793d76fc406c2a4b8032fdf60f32ef5c5c17f1183a5c7c6f17ab981660eae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eledform.sty \
texlive-eledform"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eledmac.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
