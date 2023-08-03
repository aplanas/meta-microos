SUMMARY = "Display class/package/file information"
DESCRIPTION = "The package provides a minimalist shell script, for Unix \
systems, that displays the information content in a \
\\ProvidesFile, \\ProvidesPackage or \\ProvidesClass command in a \
LaTeX source file. The package requires that the readprov \
package is available."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.31svn29349"

RPM_NAME = "texlive-typeoutfileinfo-2023.209.0.0.31svn29349-53.1.noarch.rpm"
RPM_HASH = "6db2dd8efaa5ef69cfb4f1cf30e02613374b3c4524f136ac5e201bab0a95be88c65d9afec719dcae6e5ba17e3f6efe5a440c1f040c0fba77e3abd9408966d38f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typeoutfileinfo"

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
texlive-scripts-bin \
texlive-typeoutfileinfo-bin"

inherit rpm
