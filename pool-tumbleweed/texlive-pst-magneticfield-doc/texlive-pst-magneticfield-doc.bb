SUMMARY = "Documentation for texlive-pst-magneticfield"
DESCRIPTION = "This package includes the documentation for texlive-pst-magneticfield"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.17svn63821"

RPM_NAME = "texlive-pst-magneticfield-doc-2023.209.1.17svn63821-53.1.noarch.rpm"
RPM_HASH = "0e85e3559cebd81e73d7e7705b035632f88b27a94ba49a81261d35fc8121d661fda6f98b35df211d1e542cd456785ccc5bc8de627232985e7e120224aa3b0b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-magneticfield-doc"

RDEPENDS:${PN} += ""

inherit rpm
