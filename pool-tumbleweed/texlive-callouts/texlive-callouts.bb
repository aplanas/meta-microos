SUMMARY = "Put simple annotations and notes inside a picture"
DESCRIPTION = "The package defines the annotation environment in which \
callouts, notes, arrows, and the like can be placed to describe \
certain parts of a picture."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44899"

RPM_NAME = "texlive-callouts-2023.209.svn44899-53.1.noarch.rpm"
RPM_HASH = "a0960815f869005a8548a7cf6040fbb8d32a77a6b42b61cbf6692017d1ee6bf03a9adbbbe8e78b39f5109546e520afdc2f8ffebfcdb0a0342756a58794ff3e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-callouts.sty \
texlive-callouts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-tikz.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
