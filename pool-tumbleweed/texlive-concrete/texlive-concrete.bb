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

PV = "2023.201.svn57963"

RPM_NAME = "texlive-concrete-2023.201.svn57963-53.1.noarch.rpm"
RPM_HASH = "1cceb7bb48bb0f752f8ac20702d7bddcb247efc73c61d2c7deabb83a64d5a07713ddd238b61e56c83333035a75d7e85806959b3b552a9eefbe5bbc840f4614f4"
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
