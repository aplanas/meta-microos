SUMMARY = "Documentation for qt6-quickeffectmaker in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quickeffectmaker in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quickeffectmaker-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "3a08efcece01f6b2a3dde17bb05c5b256b01fce57f26709d803f295e697e2434ffcf54b5d3315ff2dfe0e3e1c5b805a611ab0e3a7bff9d62aac2b56541689043"

RPROVIDES:${PN} += "qt6-quickeffectmaker-docs-html \
qt6-quickeffectmaker-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
