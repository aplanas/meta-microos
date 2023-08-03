SUMMARY = "Support for Czech/Slovak languages"
DESCRIPTION = "This package mirrors the macros part of the home site's \
distribution of CSTeX. The licence (modified GPL) applies to \
some of the additions that make it a Czech/Slovak language \
distribution, rather than the distribution of a basic \
Plain/LaTeX distribution."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64149"

RPM_NAME = "texlive-cstex-2023.209.svn64149-55.1.noarch.rpm"
RPM_HASH = "c5c87513bc0031428d994293c234d32487e27d610a139588e99f1d8c14adfe7429c726d822cc93212174f17a85a4c7ea1f3047fcc4d311782c890addc9e21c1e"
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
