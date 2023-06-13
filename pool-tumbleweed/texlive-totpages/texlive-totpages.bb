SUMMARY = "Count pages in a document, and report last page number"
DESCRIPTION = "The package counts the actual pages in the document (as opposed \
to reporting the number of the last page, as does lastpage). \
The counter itself may be shipped out to the DVI file. The \
package uses the everyshi package for its task."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.00svn15878"

RPM_NAME = "texlive-totpages-2023.201.2.00svn15878-52.1.noarch.rpm"
RPM_HASH = "ddd780a7140f131c12764ee1704ee61641015d25b3c99dd6fb5c9c3bebd243ee692bb299e3cd5b81984bde7e9dfe7ebdb39a2d62259ba670dd0235525a3b7926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(totpages.sty) \
texlive-totpages"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(everyshi.sty) \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
