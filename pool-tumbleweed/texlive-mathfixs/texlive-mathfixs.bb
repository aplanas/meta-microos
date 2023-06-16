SUMMARY = "Fix various layout issues in math mode"
DESCRIPTION = "This is a LaTeX2e package to fix some odd behaviour in math \
mode such as spacing around fractions and roots, math symbols \
within bold text as well as capital Greek letters. It also adds \
some related macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn49547"

RPM_NAME = "texlive-mathfixs-2023.201.1.01svn49547-52.1.noarch.rpm"
RPM_HASH = "87eed07a8d91992d1c379ca7a56cd6ec33e376d71e1d22c55c140aa72362ac21d3af2e25c000dc7d11c5d7c03e75da9f4dc746886cf04d8baca6866b747f9ddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathfixs.sty \
texlive-mathfixs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
