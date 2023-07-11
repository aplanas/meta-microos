SUMMARY = "Complete set of information/warning/error message macros"
DESCRIPTION = "This package provides a complete set of macros for information, \
warning and error messages. Under LaTeX, the commands are \
wrappers for the corresponding LaTeX commands; under Plain TeX \
they are available as complete implementations."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.5svn53023"

RPM_NAME = "texlive-infwarerr-2023.208.1.5svn53023-53.1.noarch.rpm"
RPM_HASH = "efd348337a6629858d071e024b0df96d3f55cf7b6be08ed2882d2e9dc369f39c7062ee30e9be5a3e248a3dd486aba862ae1e0a33d4d9404116d502f0c44c4b8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-infwarerr.sty \
texlive-infwarerr"

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
