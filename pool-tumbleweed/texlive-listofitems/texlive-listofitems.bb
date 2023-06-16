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

PV = "2023.201.1.63svn51923"

RPM_NAME = "texlive-listofitems-2023.201.1.63svn51923-54.1.noarch.rpm"
RPM_HASH = "12d7902c54c8e64cc878035580b4f863fdc3da1d3c21ad5976075bad13b2f99ab282f7645f48c37971c9fe7b0effa1202a0877ee459f36c868f0db5167d3061e"
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
