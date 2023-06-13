SUMMARY = "Documentation for texlive-ocr-b"
DESCRIPTION = "This package includes the documentation for texlive-ocr-b"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20852"

RPM_NAME = "texlive-ocr-b-doc-2023.201.svn20852-54.1.noarch.rpm"
RPM_HASH = "895783171b2de65d15db2fa16f404839b87c99b1e1e2ad2e5c266319919d4d1e53fd613a37f97e7eda0bd4aa8d288bd4c762c6ea9880970bc5585a7f126edfe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ocr-b-doc"

RDEPENDS:${PN} += ""

inherit rpm
