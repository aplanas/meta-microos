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

PV = "2023.209.4.1svn45215"

RPM_NAME = "texlive-eqparbox-2023.209.4.1svn45215-54.2.noarch.rpm"
RPM_HASH = "876b505c8d411ca84bc0a4f32f42891e6c6c6d491c06b339f01c429dc17e67c6b57600625c0733170eab2b1013d2f05248472d8a47249ebf86184dd854465ce2"
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
