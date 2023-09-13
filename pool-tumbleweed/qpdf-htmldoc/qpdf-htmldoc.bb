SUMMARY = "Documentation files for qpdf"
DESCRIPTION = "This package contains the documentation for qpdf"
LICENSE = "Apache-2.0"

PV = "11.6.0"

RPM_NAME = "qpdf-htmldoc-11.6.0-1.1.noarch.rpm"
RPM_HASH = "a848aa42d7fec48f4b8d11b57851dbb63d8bf0b0eb932e94b5f5f4794fefcdc9c349c4902e6d462378521d1feaada3ffb655a04ac8db5ec7f71789e8b67d9650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qpdf-htmldoc"

RDEPENDS:${PN} += ""

inherit rpm
