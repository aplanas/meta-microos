SUMMARY = "Complete set of information/warning/error message macros"
DESCRIPTION = "This package provides a complete set of macros for information, \
warning and error messages. Under LaTeX, the commands are \
wrappers for the corresponding LaTeX commands; under Plain TeX \
they are available as complete implementations."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn53023"

RPM_NAME = "texlive-infwarerr-2023.209.1.5svn53023-54.1.noarch.rpm"
RPM_HASH = "360a5acd48d83175a5c7460737e36413488608abda874aa77463d5ca74462e548e4f63f73cbc51a40286cd1cbe6276be54cac619fbccea7b598878bd7bb0c3b3"
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
