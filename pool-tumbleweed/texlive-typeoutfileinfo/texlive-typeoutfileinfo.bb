SUMMARY = "Display class/package/file information"
DESCRIPTION = "The package provides a minimalist shell script, for Unix \
systems, that displays the information content in a \
\\ProvidesFile, \\ProvidesPackage or \\ProvidesClass command in a \
LaTeX source file. The package requires that the readprov \
package is available."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.31svn29349"

RPM_NAME = "texlive-typeoutfileinfo-2023.201.0.0.31svn29349-52.1.noarch.rpm"
RPM_HASH = "4b4c766d8063d317ee20a660ce4e135660e2019ce541c87e774e7d936ab26b730296a040c6cccb3b59f3d7d7bb29f42330b3e56c875a65b9b9b409d2c20a9176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typeoutfileinfo"

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
texlive-scripts-bin \
texlive-typeoutfileinfo-bin"

inherit rpm
