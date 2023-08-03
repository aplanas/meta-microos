SUMMARY = "Add picture commands (or backgrounds) to every page"
DESCRIPTION = "The package adds one or more user commands to LaTeX's shipout \
routine, which may be used to place the output at fixed \
positions. The grid option may be used to find the correct \
places."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0asvn56658"

RPM_NAME = "texlive-eso-pic-2023.209.3.0asvn56658-53.1.noarch.rpm"
RPM_HASH = "5625910834676d908850824cf2bc213919a9b3cfd15dde6b3eae7567e127cf252a8fa12c46f0c5b13a499e3e72b64c4de7851d4cc62374867772747f3f32ba06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eso-pic.sty \
tex-showframe.sty \
texlive-eso-pic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-keyval.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
