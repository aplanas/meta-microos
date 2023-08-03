SUMMARY = "Grab items in lists using user-specified sep char"
DESCRIPTION = "This simple package is designed to read a list of items whose \
parsing character may be selected by the user. Once the list is \
read, its items are stored in a structure that behaves as a \
dimensioned array. As such, it becomes very easy to access an \
item in the list by its number. For example, if the list is \
stored in the macro \\foo, the item #3 is designated by \\foo[3]. \
A component may, in turn, be a list with a parsing delimiter \
different from the parent list, paving the way for nesting and \
employing a syntax reminiscent of an array of several \
dimensions of the type \\foo[3,2] to access the item #2 of the \
list contained within the item #3 of the top-tier list."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.63svn51923"

RPM_NAME = "texlive-listofitems-2023.209.1.63svn51923-55.1.noarch.rpm"
RPM_HASH = "caedd2b241a1dfd820611ee5a73bf3eb1942c25a18cf6de4708a54361f0f347688e39e7698128a222dde83fdf5446c0a8510e98fd5e4beb974afaa75028c73da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listofitems.sty \
tex-listofitems.tex \
tex-listofitemsold.tex \
texlive-listofitems"

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
