SUMMARY = "Get first and last words of a page"
DESCRIPTION = "The package extracts the first and last words of a page, \
together with the first word of the next page, just before the \
page is formed into the object to print. The package defines a \
couple of page styles that use the words that have been \
extracted."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29803"

RPM_NAME = "texlive-fwlw-2023.201.svn29803-52.1.noarch.rpm"
RPM_HASH = "f6081586e63858f815becb40b993cfa7dbd546f289852686d83dcbafd91fc1c895f025fd2bed8953a191a400c9d070b81e1f8ee85329dcbbd7544484b9ab934c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fwlw.sty) \
texlive-fwlw"

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
