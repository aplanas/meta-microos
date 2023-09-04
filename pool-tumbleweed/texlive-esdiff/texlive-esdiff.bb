SUMMARY = "Simplify typesetting of derivatives"
DESCRIPTION = "The package makes writing derivatives very easy. It offers \
macros for derivatives, partial derivatives and multiple \
derivatives, and allows specification of the point at which the \
value is calculated. Some typographic alternatives may be \
selected by package options"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn21385"

RPM_NAME = "texlive-esdiff-2023.209.1.2svn21385-54.2.noarch.rpm"
RPM_HASH = "e0cf7735d9524bc7c16fb9acad563fdade83bac04e9ad2574c9e4bb7da383ea516abc289f7c9f4d704288b86658f5160beef00b97979d74c98a5f4abf86cdbde"
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
