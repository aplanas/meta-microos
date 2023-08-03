SUMMARY = "Access and compare info and modification dates"
DESCRIPTION = "The package provides basic access to the date of a LaTeX source \
file according to its \\Provides... entry (the 'info date') as \
well as to its modification date according to \\pdffilemoddate \
if the latter is available."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29529"

RPM_NAME = "texlive-filedate-2023.209.svn29529-53.1.noarch.rpm"
RPM_HASH = "c23ea6d74c0d704e91fde66150c8fe98a3e45e064e3b4a2783f06606bf8ee548f80f702d3d90cf8e4c4e644d08127d97c962be4378dcf95ea058f6bd123c1794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-filedate.sty \
texlive-filedate"

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
