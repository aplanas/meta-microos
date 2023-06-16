SUMMARY = "Support for Czech/Slovak languages"
DESCRIPTION = "This package mirrors the macros part of the home site's \
distribution of CSTeX. The licence (modified GPL) applies to \
some of the additions that make it a Czech/Slovak language \
distribution, rather than the distribution of a basic \
Plain/LaTeX distribution."
LICENSE = "LPPL-1.0"

PV = "2023.204.svn64149"

RPM_NAME = "texlive-cstex-2023.204.svn64149-54.1.noarch.rpm"
RPM_HASH = "8dc123d260c17b5a679a93b3a59f0cc2cd971ad0af4d4fffcb3807db8760e6c08fd64e9934911866e309db271ffe0e2cf883894b6afa966c26fd723c56adf7bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cstex"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
