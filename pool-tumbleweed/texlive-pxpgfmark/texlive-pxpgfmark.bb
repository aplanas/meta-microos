SUMMARY = "E-pTeX driver for PGF inter-picture connections"
DESCRIPTION = "The distributed drivers do not support the PGF feature of \
'inter-picture connections' under e-pTeX and dvipdfmx. The \
package uses existing features of dvipdfmx to fix this problem"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn30212"

RPM_NAME = "texlive-pxpgfmark-2023.201.0.0.2svn30212-53.1.noarch.rpm"
RPM_HASH = "98e9293cada37d65167122ac09a02a8dd5a2e9d3e95508ca29200f0760a8a4626a8eb472d9653b615f4a44860d10548f5206e631701a232bfe30a23e8d607aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxpgfmark.sty \
texlive-pxpgfmark"

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
