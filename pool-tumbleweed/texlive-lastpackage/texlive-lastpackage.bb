SUMMARY = "Indicates the last loaded package"
DESCRIPTION = "This package may be used to define the last point where some \
code shall be executed. Its provides a package name for use in \
package-placing commands from the author's templatetools. Usage \
examples are provided in the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn34481"

RPM_NAME = "texlive-lastpackage-2023.209.0.0.1svn34481-56.1.noarch.rpm"
RPM_HASH = "0b1764a66f193882f4090ab37ad4bcaad9c1059839f05fd962b2c18e851d5b1520ae7b303413b2d8010e38ace6088c8c7bf7266f0e8c7dcda15774a2c6d55c4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lastpackage.sty \
texlive-lastpackage"

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
