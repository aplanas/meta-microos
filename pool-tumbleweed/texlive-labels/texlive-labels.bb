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

PV = "2023.201.0.0.13svn15878"

RPM_NAME = "texlive-labels-2023.201.0.0.13svn15878-55.1.noarch.rpm"
RPM_HASH = "cd48761e9f44f0bb3ce49d99632cbd98405262ee4d897479e6b62df1e3b686e601bfab60444c87e72faf0fe49d92bdd83b708bb9f7089243f216c2b44f1d7d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-labels.sty \
tex-olabels.sty \
texlive-labels"

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
