SUMMARY = "Simplify typesetting of derivatives"
DESCRIPTION = "The package makes writing derivatives very easy. It offers \
macros for derivatives, partial derivatives and multiple \
derivatives, and allows specification of the point at which the \
value is calculated. Some typographic alternatives may be \
selected by package options"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn21385"

RPM_NAME = "texlive-esdiff-2023.209.1.2svn21385-54.1.noarch.rpm"
RPM_HASH = "473a0d63d59294ad5cf606ab15b52497c97455675a3f275f381bc529bff38b570b6ea4c857dd81b522aa8083df2f311693e214a1203a5a1733db4e2ec5488ca8"
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
