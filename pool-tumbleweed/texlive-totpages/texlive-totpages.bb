SUMMARY = "Count pages in a document, and report last page number"
DESCRIPTION = "The package counts the actual pages in the document (as opposed \
to reporting the number of the last page, as does lastpage). \
The counter itself may be shipped out to the DVI file. The \
package uses the everyshi package for its task."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.00svn15878"

RPM_NAME = "texlive-totpages-2023.209.2.00svn15878-53.1.noarch.rpm"
RPM_HASH = "491d6960ff0352bc1629bd498b017de8c0f822a881e12e7178810f81267bdd137d866b48685414554373852907527d5578681cc55ec3423dc1c38ad4d6905421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-totpages.sty \
texlive-totpages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everyshi.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
