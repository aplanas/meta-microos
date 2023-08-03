SUMMARY = "Documentation for texlive-etextools"
DESCRIPTION = "This package includes the documentation for texlive-etextools"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1415926svn20694"

RPM_NAME = "texlive-etextools-doc-2023.209.3.1415926svn20694-53.1.noarch.rpm"
RPM_HASH = "407105a448349f89eedc1fc0bf44c2bb553ce98e1b749ffb74c9106c46cd2791018f99af4f322a7f9799053cb68322402400b0d7d9ce7a64d7779e753327aabc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etextools-doc"

RDEPENDS:${PN} += ""

inherit rpm
