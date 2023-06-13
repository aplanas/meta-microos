SUMMARY = "Documentation files for qpdf"
DESCRIPTION = "This package contains the documentation for qpdf"
LICENSE = "Apache-2.0"

PV = "11.3.0"

RPM_NAME = "qpdf-htmldoc-11.3.0-1.3.noarch.rpm"
RPM_HASH = "78f8ff1991199d2e432b16dd1c3797cb0876b864fa376a9e4dcf03ad8f936c902d6527c5c1b32c0c1ca6d57dbc2a1ff714f95ef2aac611c52f4566d59ccb80d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qpdf-htmldoc"

RDEPENDS:${PN} += ""

inherit rpm
