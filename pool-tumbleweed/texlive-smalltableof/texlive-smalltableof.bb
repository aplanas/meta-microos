SUMMARY = "Create listoffigures etc. in a single chapter"
DESCRIPTION = "The package allows you to create a list of figures and list of \
tables in a chapter named 'List' that contains separate \
sections for each list of figures, tables, etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20333"

RPM_NAME = "texlive-smalltableof-2023.201.svn20333-57.1.noarch.rpm"
RPM_HASH = "b9774bea0e72d27c79af001cf4da4336e18b7a494451ba4c6fe0fa6f614010b0c224fd9464604b4a28fb3df38fff61b161e65801ce13867ab255716c2867496b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-smalltableof.sty \
texlive-smalltableof"

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
