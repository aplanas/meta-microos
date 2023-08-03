SUMMARY = "Documentation for texlive-showexpl"
DESCRIPTION = "This package includes the documentation for texlive-showexpl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3ssvn57414"

RPM_NAME = "texlive-showexpl-doc-2023.209.0.0.3ssvn57414-54.1.noarch.rpm"
RPM_HASH = "772ad0d4078308a931f2692ebd33f49db2b2aae08998d0b7dfbb5c1d4b36b10b64297001ae065bff0ee6716337ced0c8dcfee5648ee5274c8f545a0bb70547a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showexpl-doc"

RDEPENDS:${PN} += ""

inherit rpm
