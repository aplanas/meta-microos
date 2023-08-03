SUMMARY = "Documentation for texlive-begingreek"
DESCRIPTION = "This package includes the documentation for texlive-begingreek"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn63255"

RPM_NAME = "texlive-begingreek-doc-2023.209.1.7svn63255-54.1.noarch.rpm"
RPM_HASH = "13dd7e0b7fd6c811cdf62f960915649589d1561fa9fce748d58fc365d5e9569140fc744b876f9941024052bf52196a8fe5b0d96f0065d6a2546f726f58323701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-begingreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
