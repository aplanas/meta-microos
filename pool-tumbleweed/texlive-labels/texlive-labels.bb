SUMMARY = "Print sheets of sticky labels"
DESCRIPTION = "A LaTeX package to print a regular grid of ragged-right labels \
on a page, suitable for sheets of labels which can be fed \
through a printer. Macros are provided to allow easy input of \
names and addresses in a form free of TeX markup. Equally \
useful is a feature for making multiple copies of a single \
label, e.g., return address stickers to go with the labels. \
Rows, columns, borders can all be specified to match the label \
sheet being used."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn15878"

RPM_NAME = "texlive-labels-2023.209.0.0.13svn15878-56.1.noarch.rpm"
RPM_HASH = "142259aff968547e784f3371653d3c9bdcca72f2b4f1508a923c1f038d34939d13dd1ac3f6fe60d98bb804bbc26b56bec88d268e3f1b51d5271c444880ab9c9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-labels.sty \
tex-olabels.sty \
texlive-labels"

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
