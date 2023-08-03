SUMMARY = "Flush left equations with dotted leaders to the numbers"
DESCRIPTION = "The package provides a different format for typesetting \
equations, one reportedly used in 'old style Britsh books': \
equations aligned on the left, with dots on the right leading \
to the equation number. In default of an equation number, the \
package operates much like the fleqn class option (no leaders)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn17195"

RPM_NAME = "texlive-dotseqn-2023.209.1.1svn17195-53.1.noarch.rpm"
RPM_HASH = "f092361864c6804fc9460679cf16f597c2a37fc5bc88f6d12d4251bfcb8a3373fdfcac1545a387ee1db454a9f964d4b5a17383821eee2d874308a0f905aa1f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dotseqn.sty \
texlive-dotseqn"

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
