SUMMARY = "Documentation files for qpdf"
DESCRIPTION = "This package contains the documentation for qpdf"
LICENSE = "Apache-2.0"

PV = "11.4.0"

RPM_NAME = "qpdf-htmldoc-11.4.0-1.1.noarch.rpm"
RPM_HASH = "f2363e49a30a3993b8b55e320450034ce3bef776490f52e56a4444fe60f3f11f82d00b0feff0a6429cab9012bf60998d7c8ca724dd509112c38c8c460f3a5abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qpdf-htmldoc"

RDEPENDS:${PN} += ""

inherit rpm
