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

RPM_NAME = "texlive-eqparbox-2023.209.4.1svn45215-54.1.noarch.rpm"
RPM_HASH = "1c64671a5710add2355bc35ec0a668361b677ccdfbd8cc194298cdeb3d52f5b0bfdc7df77c08ff6a7dd4eee6335f80400f3c3dbe98423be4a35245a5dcb43f35"
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
