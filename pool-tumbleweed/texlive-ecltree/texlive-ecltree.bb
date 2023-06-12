SUMMARY = "Trees using epic and eepic macros"
DESCRIPTION = "The package recursively draws trees: each subtree is defined in \
a 'bundle' environment, with a set of leaves described by \
\\chunk macros. A chunk may have a bundle environment inside it."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn15878"

RPM_NAME = "texlive-ecltree-2023.201.1.1asvn15878-53.1.noarch.rpm"
RPM_HASH = "dfe66c0981ee7f9d6be0f4c4949a94ae16258eb48fef48e66ac67e799007e09fde22a0ef794df4972d44d0ddad0b79ebb64f4f18baeebebf9cb4c88541b4f94a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ecltree.sty) \
texlive-ecltree"
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
