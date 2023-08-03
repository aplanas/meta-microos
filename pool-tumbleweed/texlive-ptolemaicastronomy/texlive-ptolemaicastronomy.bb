SUMMARY = "Diagrams of sphere models for variably strict conditionals (Lewis counterfactuals)"
DESCRIPTION = "David K. Lewis (Counterfactuals, Blackwell 1973) introduced a \
sphere semantics for counterfactual conditionals. He jokingly \
referred to the diagrams depicting such sphere models as \
Ptolemaic astronomy, hence the name of this package. The macros \
provided in this package aid in the construction of sphere \
model diagrams in the style of Lewis. The macros all make use \
of TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn50810"

RPM_NAME = "texlive-ptolemaicastronomy-2023.209.1.0svn50810-54.1.noarch.rpm"
RPM_HASH = "fff3e564fe3bb45b6e47a8733d22c396a0b749f98e9e7574fba8435714586ec7d2cdeab7274b5e1f1fe9aab9539ef0c85c89acaf2817ae6cfcccb47dfa3b141b"
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
