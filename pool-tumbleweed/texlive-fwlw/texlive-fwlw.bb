SUMMARY = "Get first and last words of a page"
DESCRIPTION = "The package extracts the first and last words of a page, \
together with the first word of the next page, just before the \
page is formed into the object to print. The package defines a \
couple of page styles that use the words that have been \
extracted."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29803"

RPM_NAME = "texlive-fwlw-2023.209.svn29803-53.1.noarch.rpm"
RPM_HASH = "951cf56f92731dca07a8a716bf5e5abc3360286c2c04be2e4ef864d8cb9754cdaf944635faacc0b75ae89129e0774f29ffd7fed5cc856c6f718e4e8a1948631e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fwlw.sty \
texlive-fwlw"

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
