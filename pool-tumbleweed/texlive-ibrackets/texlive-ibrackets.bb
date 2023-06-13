SUMMARY = "Intelligent brackets"
DESCRIPTION = "This small package provides a new definition of brackets [ and \
] as active characters to get correct blank spaces in \
mathematical mode when using for open intervals. Instead of \
parenthesis: ]-\\infty, 0[ is equivalent to (-\\infty, 0)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn65383"

RPM_NAME = "texlive-ibrackets-2023.201.1.1svn65383-52.1.noarch.rpm"
RPM_HASH = "07514271ffa815791fe982af7edb3cb365099120e25a63d0002a7c451c546e327f4fbb05dd2e244c9123a39393574df107b37319008083207526ed6ff68680c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ibrackets.sty) \
texlive-ibrackets"

RDEPENDS:${PN} += "/bin/sh \
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
