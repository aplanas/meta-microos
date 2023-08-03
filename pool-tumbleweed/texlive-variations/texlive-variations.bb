SUMMARY = "Typeset tables of variations of functions"
DESCRIPTION = "The package provides macros for typesetting tables showing \
variations of functions according to French usage. These macros \
may be used by both LaTeX and plain TeX users."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.3svn15878"

RPM_NAME = "texlive-variations-2023.209.0.0.3svn15878-54.1.noarch.rpm"
RPM_HASH = "fb31b9fb7c261c7ce5fd22e946b96c8e05232d18fa4faa620c2542c94d3f19bc3e1ba490f0ef24cea232d546d562e07da10ed35013844af445bc87fcf6d9859c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-variations.sty \
tex-variations.tex \
texlive-variations"

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
