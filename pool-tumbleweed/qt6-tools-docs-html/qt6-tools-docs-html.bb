SUMMARY = "Documentation for qt6-tools in HTML format"
DESCRIPTION = "This package contains documentation for qt6-tools in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-tools-docs-html-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "757ec34264614132dd6aeafe73c990ae5c3f11814e9ce95dac2e103b008b8575de9b4ea7679961769b72de8fe4c77cfff2b6f5b1ee0ca50a65197793c05cca53"

RPROVIDES:${PN} += "qt6-tools-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
