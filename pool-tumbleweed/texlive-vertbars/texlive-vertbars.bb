SUMMARY = "Mark vertical rules in margin of text"
DESCRIPTION = "This package is an extension to lineno, replacing that \
package's line numbers with bars to the left or right of the \
text."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0csvn49429"

RPM_NAME = "texlive-vertbars-2023.209.1.0csvn49429-54.1.noarch.rpm"
RPM_HASH = "878c662cd5c15dc38fa53474d89a42ebb9968d35f0264458606efb22ce89304dd783cb38c3bd3e61b3466742356c373d9f153787e10ace18d639446cbb415b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vertbars.sty \
texlive-vertbars"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-lineno.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
