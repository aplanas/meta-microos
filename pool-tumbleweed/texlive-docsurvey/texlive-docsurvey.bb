SUMMARY = "A survey of LaTeX documentation"
DESCRIPTION = "A survey of programming-related documentation for LaTeX. \
Included are references to printed and electronic books and \
manuals, symbol lists, FAQs, the LaTeX source code, CTAN and \
distributions, programming-related packages, users groups and \
online communities, and information on creating packages and \
documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61447"

RPM_NAME = "texlive-docsurvey-2023.201.svn61447-52.1.noarch.rpm"
RPM_HASH = "c46848a79f0662b22584110c1f44b9be7ade7b94cd38d49ac4053671dfe5f1a1e46a3ef0d5772c1791e6005f10a7d39ecb3cb8f0294f396d90f6ad8920246ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-docsurvey"

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
