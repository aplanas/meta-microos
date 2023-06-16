SUMMARY = "Simplify typesetting of derivatives"
DESCRIPTION = "The package makes writing derivatives very easy. It offers \
macros for derivatives, partial derivatives and multiple \
derivatives, and allows specification of the point at which the \
value is calculated. Some typographic alternatives may be \
selected by package options"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn21385"

RPM_NAME = "texlive-esdiff-2023.201.1.2svn21385-53.1.noarch.rpm"
RPM_HASH = "f6acaf0f039a8829da5f8a625be7d095def02c83971bad2da10519266338d2e9cbe3195db1682544e53400a19fbd0be3c136731bdf87903d900961ca51d60537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esdiff.sty \
texlive-esdiff"

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
