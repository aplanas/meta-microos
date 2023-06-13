SUMMARY = "Put simple annotations and notes inside a picture"
DESCRIPTION = "The package defines the annotation environment in which \
callouts, notes, arrows, and the like can be placed to describe \
certain parts of a picture."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44899"

RPM_NAME = "texlive-callouts-2023.201.svn44899-52.1.noarch.rpm"
RPM_HASH = "0e777a70114024c499380472c36a242c7394eb32b194a69f82bd7a510c0138abf184719dfa28c27eaf6bcb895cca306dc3cbbeb73e3b3fab3117e9639971867c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(callouts.sty) \
texlive-callouts"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(kvoptions.sty) \
tex(tikz.sty) \
tex(xifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
