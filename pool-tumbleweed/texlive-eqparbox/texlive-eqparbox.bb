SUMMARY = "Create equal-widthed parboxes"
DESCRIPTION = "LaTeX users sometimes need to ensure that two or more blocks of \
text occupy the same amount of horizontal space on the page. To \
that end, the eqparbox package defines a new command, \
\\eqparbox, which works just like \\parbox, except that instead \
of specifying a width, one specifies a tag. All eqparboxes with \
the same tag--regardless of where they are in the \
document--will stretch to fit the widest eqparbox with that \
tag. This simple, equal-width mechanism can be used for a \
variety of alignment purposes, as is evidenced by the examples \
in eqparbox's documentation. Various derivatives of \\eqparbox \
are also provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1svn45215"

RPM_NAME = "texlive-eqparbox-2023.201.4.1svn45215-53.1.noarch.rpm"
RPM_HASH = "3040b2f7351afa2ded1d3cdc18781912b5c2e3bb483c2060cbecefdf8f07c12003105528de9cbe1d24b206e64af97da6bdb788ad5d77316fb45aab6239a8c059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(eqparbox.sty) \
texlive-eqparbox"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(environ.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
