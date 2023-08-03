SUMMARY = "Concrete Roman fonts"
DESCRIPTION = "Concrete Roman fonts, designed by Donald E. Knuth, originally \
for use with Euler mathematics fonts. Alternative mathematics \
fonts, based on the concrete 'parameter set' are available as \
the concmath fonts bundle. LaTeX support is offered by the \
beton, concmath and ccfonts packages. T1- and TS1-encoded \
versions of the fonts are available in the ecc bundle, and \
Adobe Type 1 versions of the ecc fonts are part of the cm-super \
bundle."
LICENSE = "SUSE-TeX"

PV = "2023.209.svn57963"

RPM_NAME = "texlive-concrete-2023.209.svn57963-54.1.noarch.rpm"
RPM_HASH = "e8b76369e4e23e076f80941ec5f6f1e4fb0b97b036e18167eb2adebb5484693f6a712452617fef51b14b17a7f102a7039965fcc676a7585761cdd2b4aa31fa0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cccsc10.tfm \
tex-ccmi10.tfm \
tex-ccmic9.tfm \
tex-ccr10.tfm \
tex-ccr5.tfm \
tex-ccr6.tfm \
tex-ccr7.tfm \
tex-ccr8.tfm \
tex-ccr9.tfm \
tex-ccsl10.tfm \
tex-ccsl9.tfm \
tex-ccslc9.tfm \
tex-ccti10.tfm \
texlive-concrete"

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
