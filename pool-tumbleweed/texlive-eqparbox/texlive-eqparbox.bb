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

RPM_NAME = "texlive-eqparbox-2023.201.4.1svn45215-53.2.noarch.rpm"
RPM_HASH = "60276c815e661238736dd75745b35c9424add7de3dc8506c5d178cc17f13f834bec0ec4754d7c8292a5f94961e850ababafcad48fd767ed9e0c3fbd0a8925b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqparbox.sty \
texlive-eqparbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-environ.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
