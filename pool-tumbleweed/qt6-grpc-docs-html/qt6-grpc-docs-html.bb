SUMMARY = "Documentation for qt6-grpc in HTML format"
DESCRIPTION = "This package contains documentation for qt6-grpc in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-grpc-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d96a5980884183ac653e53894416d9d002b302e8235158a5dbd7ba8e0667b839b3d7775c3f76d2f03a12e4dd608cd6923095969501a24d78255820786a27acac"

RPROVIDES:${PN} += "qt6-grpc-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
