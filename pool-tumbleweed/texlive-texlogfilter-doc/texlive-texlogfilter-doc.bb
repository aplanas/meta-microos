SUMMARY = "Documentation for texlive-texlogfilter"
DESCRIPTION = "This package includes the documentation for texlive-texlogfilter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn62792"

RPM_NAME = "texlive-texlogfilter-doc-2023.209.1.1svn62792-55.1.noarch.rpm"
RPM_HASH = "69b7a52e754030983aaed98713d008660288096ddaa59f20986b8fc66e1c2bb2c7352bc64891ba60ad30ced125106eed9cadcd2acd1dafe273047523fe3df570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texlogfilter.1 \
texlive-texlogfilter-doc"

RDEPENDS:${PN} += ""

inherit rpm
