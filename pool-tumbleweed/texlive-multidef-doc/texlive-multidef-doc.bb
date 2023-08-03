SUMMARY = "Documentation for texlive-multidef"
DESCRIPTION = "This package includes the documentation for texlive-multidef"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn40637"

RPM_NAME = "texlive-multidef-doc-2023.209.1.10svn40637-55.1.noarch.rpm"
RPM_HASH = "a6fe704da22798fb656f8688d64171570a4898d400e4086b53774bddb9a5bd945469c90aff32a3987c01299fe6d4d158e39d01d1118c1cb2022ebbaebed4faa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multidef-doc"

RDEPENDS:${PN} += ""

inherit rpm
