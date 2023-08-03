SUMMARY = "A survey of LaTeX documentation"
DESCRIPTION = "A survey of programming-related documentation for LaTeX. \
Included are references to printed and electronic books and \
manuals, symbol lists, FAQs, the LaTeX source code, CTAN and \
distributions, programming-related packages, users groups and \
online communities, and information on creating packages and \
documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61447"

RPM_NAME = "texlive-docsurvey-2023.209.svn61447-53.1.noarch.rpm"
RPM_HASH = "652f36c156f0791c036090ca18e6effdd1efdd70e64e5cc4fa8388fb9e67deaadab31dd691362dd4559792282415254a20c0fcf091d664cba780c9d79a8ddc19"
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
