SUMMARY = "Package for working with complicated folder structures"
DESCRIPTION = "This package simplifies working with folder structures that \
match the chapter/section/subsection structure. It provides \
macros to define a folder that contains the file for a \
chapter/section/subsection, and provides macros that allow \
inclusion without using the full path, rather the path relative \
to the current folder of the chapter/section/subsection. It \
makes easy changing the name of a folder, for example."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.1svn15878"

RPM_NAME = "texlive-chapterfolder-2023.201.2.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "4dc860c72371aa767b6d46cd800879106f3c19b6f29f06e7fc0036e78b60b20ff694f1e6f4567aec2169c03941214494257b760eb94e9e1a7f562d5fbca3f97c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chapterfolder.sty \
texlive-chapterfolder"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
