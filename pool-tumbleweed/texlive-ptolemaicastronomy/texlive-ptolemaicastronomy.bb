SUMMARY = "Diagrams of sphere models for variably strict conditionals (Lewis counterfactuals)"
DESCRIPTION = "David K. Lewis (Counterfactuals, Blackwell 1973) introduced a \
sphere semantics for counterfactual conditionals. He jokingly \
referred to the diagrams depicting such sphere models as \
Ptolemaic astronomy, hence the name of this package. The macros \
provided in this package aid in the construction of sphere \
model diagrams in the style of Lewis. The macros all make use \
of TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn50810"

RPM_NAME = "texlive-ptolemaicastronomy-2023.201.1.0svn50810-53.2.noarch.rpm"
RPM_HASH = "1733216662c98c055ed2cb4d131eed55df81c6a9641e5acc138a7f25756ede9b2c1323870c070053c01a2d5b82e96345f8f042bc88e38c2c9e5b31f425d4786f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ptolemaicastronomy.sty \
texlive-ptolemaicastronomy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
