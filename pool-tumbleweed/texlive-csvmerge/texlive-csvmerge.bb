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

PV = "2023.204.1.0svn51857"

RPM_NAME = "texlive-csvmerge-2023.204.1.0svn51857-54.1.noarch.rpm"
RPM_HASH = "26a3abcc7a627b9a7329419d75ec7f2ac5e4c145c84055dc148138e7d1a3cb2505cf3ac039b8ff86f921c43d3e95d33852b687d56f520d747e9f6af66c258462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(csvmerge.sty) \
texlive-csvmerge"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(stringstrings.sty) \
tex(trimspaces.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
