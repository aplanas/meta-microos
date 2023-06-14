SUMMARY = "Complete set of information/warning/error message macros"
DESCRIPTION = "This package provides a complete set of macros for information, \
warning and error messages. Under LaTeX, the commands are \
wrappers for the corresponding LaTeX commands; under Plain TeX \
they are available as complete implementations."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn53023"

RPM_NAME = "texlive-infwarerr-2023.201.1.5svn53023-52.1.noarch.rpm"
RPM_HASH = "fd41147e156caf0df4caab632f699cd79353052feba6995a160117bd579a90a32c85032953b8d210b1f71e596cb318abec3cab8099e29b7fb28fca1623866efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-infwarerr.sty \
texlive-infwarerr"

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
