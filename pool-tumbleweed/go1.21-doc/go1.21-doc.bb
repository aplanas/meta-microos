SUMMARY = "Go documentation"
DESCRIPTION = "Go examples and documentation."
LICENSE = "BSD-3-Clause"

PV = "1.21rc2"

RPM_NAME = "go1.21-doc-1.21rc2-1.1.aarch64.rpm"
RPM_HASH = "4efed6e9cda5d0305a68fe81c102b089d8c469da970e2d706568ee9e2817caa769a43af8d194d8b7f32b4b7f54c6ddb23c21a89da1b322f4ebef14334f255303"

RPROVIDES:${PN} += "go-doc \
go1.21-doc"

RDEPENDS:${PN} += ""

inherit rpm
