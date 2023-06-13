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

RPM_NAME = "texlive-ptolemaicastronomy-2023.201.1.0svn50810-53.1.noarch.rpm"
RPM_HASH = "05b1ab0608c4125e796f25319da622f8289f8bf8dc0e0f621e9ccd5ee6c3207ba77bd73c8b3b51866409a1412e494bbcc9090fb64e20f98c028cbffa57657045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ptolemaicastronomy.sty) \
texlive-ptolemaicastronomy"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
