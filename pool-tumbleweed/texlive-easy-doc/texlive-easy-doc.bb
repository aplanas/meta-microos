SUMMARY = "Documentation for texlive-easy"
DESCRIPTION = "This package includes the documentation for texlive-easy"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.99svn19440"

RPM_NAME = "texlive-easy-doc-2023.209.0.0.99svn19440-54.2.noarch.rpm"
RPM_HASH = "bdcb37ab3b4802cc901b9f272e7ab572d5455167c95f7e99c1fdd114dbcdcd5258356a2c531ae39c8ce270fb74e6889ef400ada20543939f68af0a4e8fcfc9e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easy-doc"

RDEPENDS:${PN} += ""

inherit rpm
