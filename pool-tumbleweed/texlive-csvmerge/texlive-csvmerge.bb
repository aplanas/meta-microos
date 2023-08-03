SUMMARY = "Merge TeX code with csv data"
DESCRIPTION = "This package provides macros for processing a csv spreadsheet \
file with a minimum of configuration for the csv file. The \
first row names the columns and the remaining rows are data. \
This data can be merged with TeX code residing in an auxiliary \
file and the process repeated for each data row. There is one \
macro to set things up, one to extract the data, and one to \
tell if the field is empty or not. The documentation contains \
examples."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51857"

RPM_NAME = "texlive-csvmerge-2023.209.1.0svn51857-55.1.noarch.rpm"
RPM_HASH = "16eae97759f0d86c585a6834889e2aeb83fd3a22a02ae41a75470d43e79305fa71cb7e0d92e5f23e6cf385cc9d17214dcbd810b8d9b5b3ef4afc4b56d1f401c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-csvmerge.sty \
texlive-csvmerge"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-stringstrings.sty \
tex-trimspaces.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
