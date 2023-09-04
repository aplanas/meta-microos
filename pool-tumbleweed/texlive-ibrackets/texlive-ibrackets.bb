SUMMARY = "Intelligent brackets"
DESCRIPTION = "This small package provides a new definition of brackets [ and \
] as active characters to get correct blank spaces in \
mathematical mode when using for open intervals. Instead of \
parenthesis: ]-\\infty, 0[ is equivalent to (-\\infty, 0)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn65383"

RPM_NAME = "texlive-ibrackets-2023.209.1.1svn65383-54.1.noarch.rpm"
RPM_HASH = "174d2be50179d1745e3959a7c54553b68273180b846d7299ef98a1544cb3fafe4ef77b1051eab81d7bbbd6a85bace2a07994ffdead0944855e32d2ed545d43d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ibrackets.sty \
texlive-ibrackets"

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
