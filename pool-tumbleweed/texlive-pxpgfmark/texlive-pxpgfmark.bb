SUMMARY = "E-pTeX driver for PGF inter-picture connections"
DESCRIPTION = "The distributed drivers do not support the PGF feature of \
'inter-picture connections' under e-pTeX and dvipdfmx. The \
package uses existing features of dvipdfmx to fix this problem"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn30212"

RPM_NAME = "texlive-pxpgfmark-2023.209.0.0.2svn30212-54.2.noarch.rpm"
RPM_HASH = "34337e3aa540cf41ecff021f0f8db96814db52c6c3e0a03521264cd177ce13486c2a1c02d13f46916e19e81e4d6fa94ba19755865e5a5d50af41577034f5b61d"
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
