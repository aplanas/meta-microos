SUMMARY = "E-pTeX driver for PGF inter-picture connections"
DESCRIPTION = "The distributed drivers do not support the PGF feature of \
'inter-picture connections' under e-pTeX and dvipdfmx. The \
package uses existing features of dvipdfmx to fix this problem"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn30212"

RPM_NAME = "texlive-pxpgfmark-2023.209.0.0.2svn30212-54.1.noarch.rpm"
RPM_HASH = "80d517176887a99510a4d74e5a5d78169796b538bcedc9aca050dac26e077ca46069c06996285445040d420831b972032ff8224f9fd8aa5ec0cd6fe50e44576c"
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
