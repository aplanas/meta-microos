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

RPM_NAME = "texlive-ptolemaicastronomy-2023.209.1.0svn50810-54.2.noarch.rpm"
RPM_HASH = "0235e4dd0b0ca14abfd144c5a2651d7c9bb90cfa899f3bfe04e713a200e703ad93450b5cf33c40dd32c67357e35419ba21b4852ebebb56228f59b602d825ace3"
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
