SUMMARY = "Documentation for qt6-quick3dphysics in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quick3dphysics in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dphysics-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "29a362d1f5589d77c13853a307456918b82518266410ace87b120b2a491823fdaa3829b1cf17a0767084dab5aa6edc6519f50ab04914d1e150b247bf41b90eda"

RPROVIDES:${PN} += "qt6-quick3dphysics-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
