SUMMARY = "Package for working with complicated folder structures"
DESCRIPTION = "This package simplifies working with folder structures that \
match the chapter/section/subsection structure. It provides \
macros to define a folder that contains the file for a \
chapter/section/subsection, and provides macros that allow \
inclusion without using the full path, rather the path relative \
to the current folder of the chapter/section/subsection. It \
makes easy changing the name of a folder, for example."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.1svn15878"

RPM_NAME = "texlive-chapterfolder-2023.209.2.0.1svn15878-54.1.noarch.rpm"
RPM_HASH = "5ede47112e0a84d2246e92d65a7fdbc3532eb3a89d2f0b67088be3a2e9d1b93a5efe0a67cbb415992b8fb5662aad6f5b7544666e977518417b5a0577888f3ca6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chapterfolder.sty \
texlive-chapterfolder"

RDEPENDS:${PN} += "/usr/bin/sh \
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
