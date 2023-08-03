SUMMARY = "Documentation for texlive-dialogl"
DESCRIPTION = "This package includes the documentation for texlive-dialogl"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28946"

RPM_NAME = "texlive-dialogl-doc-2023.209.svn28946-53.1.noarch.rpm"
RPM_HASH = "c0987237801b2649337c2ed6d3aa176edbd31f39c2006a382a7b05d4a463b5edc6cea13a29a0a57dbcfb9b4381ff951cef663f42ec1853ab53ccd726601516b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dialogl-doc"

RDEPENDS:${PN} += ""

inherit rpm
