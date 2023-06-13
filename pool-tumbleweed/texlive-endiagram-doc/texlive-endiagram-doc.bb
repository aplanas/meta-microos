SUMMARY = "Documentation for texlive-endiagram"
DESCRIPTION = "This package includes the documentation for texlive-endiagram"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1dsvn34486"

RPM_NAME = "texlive-endiagram-doc-2023.201.0.0.1dsvn34486-53.1.noarch.rpm"
RPM_HASH = "0acbe43b061fa23e30f6678be98c3994f2b95006bfe2a265dfca527d4ea49c245fa2973e7b73ca724ba079d044ed8f69feeac644230db5224632205c35389038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endiagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
