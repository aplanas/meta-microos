SUMMARY = "Documentation for texlive-musuos"
DESCRIPTION = "This package includes the documentation for texlive-musuos"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1dsvn24857"

RPM_NAME = "texlive-musuos-doc-2023.209.1.1dsvn24857-55.1.noarch.rpm"
RPM_HASH = "20493cd0cdc79422eae130b46b188504221f243464deeb461d044787c5504b8deba46edfb53db59f0755cab9097b4fe19618a1574555e8f098d3ff1f01ee2f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musuos-doc"

RDEPENDS:${PN} += ""

inherit rpm
