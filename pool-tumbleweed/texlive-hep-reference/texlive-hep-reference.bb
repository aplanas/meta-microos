SUMMARY = "Adjustments for publications in High Energy Physics"
DESCRIPTION = "This package makes some changes to the reference, citation and \
footnote macros to improve the default behavior of LaTeX for \
High Energy Physics publications."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64853"

RPM_NAME = "texlive-hep-reference-2023.209.1.1svn64853-54.1.noarch.rpm"
RPM_HASH = "f1bd79242bc83d11f5ca0a80032e00c5d0a68664dd3c52cf099c0f59ac1fc0b54b50cb7c8c06196fb7fa20ba80e81365e78e186252715b0a573d4ff4cb09e0bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-reference.sty \
texlive-hep-reference"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cleveref.sty \
tex-footnotebackref.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
