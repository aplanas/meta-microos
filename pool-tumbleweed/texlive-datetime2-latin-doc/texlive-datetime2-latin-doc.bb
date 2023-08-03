SUMMARY = "Documentation for texlive-datetime2-latin"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-latin"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47748"

RPM_NAME = "texlive-datetime2-latin-doc-2023.209.1.0svn47748-53.1.noarch.rpm"
RPM_HASH = "9ac28a5da00958e742847e6cfaff910d9424ec2a8a16cdc97834043bff5fec6a42e6b013f163ec8db2dbecb3067969f22d85e4bd559ec9c87b793e36ef9d47e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-latin-doc"

RDEPENDS:${PN} += ""

inherit rpm
