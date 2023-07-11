SUMMARY = "Documentation for texlive-dynblocks"
DESCRIPTION = "This package includes the documentation for texlive-dynblocks"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2bsvn35193"

RPM_NAME = "texlive-dynblocks-doc-2023.201.0.0.2bsvn35193-53.2.noarch.rpm"
RPM_HASH = "7d815faaaa5eed3b1e1f36b223a8fd4fdac245a777145da0c162e8f9204d29319fd0d6c308ccf8d753c445473390cb28f8acf83ff4ddf1d61f78dad2f0d0ab25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynblocks-doc"

RDEPENDS:${PN} += ""

inherit rpm
