SUMMARY = "E-pTeX driver for PGF inter-picture connections"
DESCRIPTION = "The distributed drivers do not support the PGF feature of \
'inter-picture connections' under e-pTeX and dvipdfmx. The \
package uses existing features of dvipdfmx to fix this problem"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn30212"

RPM_NAME = "texlive-pxpgfmark-2023.201.0.0.2svn30212-53.2.noarch.rpm"
RPM_HASH = "36afcb91db8f1a1afea7e0f8fa05021cfc427f7623b87fb671d43a96477e967535dd402b05d8e7c24c0f14238b62e8cb0af48252af82d364ea991ef75d671297"
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
