SUMMARY = "Cross references for named and numbered environments"
DESCRIPTION = "Philex provides means for creating and cross-referencing named \
or numbered environments. Possible uses would be equations, \
example sentences (as in linguistics or philosophy) or named \
principles. Cross references may refer either to the number, or \
to a short name of the target environment, or to the contents \
of the environment. Philex builds on the facilities of the \
linguex package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn36396"

RPM_NAME = "texlive-philex-2023.209.1.3svn36396-52.1.noarch.rpm"
RPM_HASH = "d41815d56522e189c66aad86a6f2c44a90aaafc337ec1acd932f6574dbf7713eb04df93b01869d9e86ffb4482d3c4b0aad19b19ace7e79e008e3f56a5683f231"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-philex.sty \
texlive-philex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-cgloss4e.sty \
tex-ifthen.sty \
tex-linguex.sty \
tex-suffix.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
