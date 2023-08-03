SUMMARY = "Create listoffigures etc. in a single chapter"
DESCRIPTION = "The package allows you to create a list of figures and list of \
tables in a chapter named 'List' that contains separate \
sections for each list of figures, tables, etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20333"

RPM_NAME = "texlive-smalltableof-2023.209.svn20333-58.1.noarch.rpm"
RPM_HASH = "47a84da22ccea8817e96526b4fc6667fc800b8b623ec1240a9cbef88bef162fbe0df6850a5d8a56eca9fdead359bcb8f5b84b681f90d51c1da5c108851458504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-smalltableof.sty \
texlive-smalltableof"

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
