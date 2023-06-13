SUMMARY = "Documentation for qt6-coap in HTML format"
DESCRIPTION = "This package contains documentation for qt6-coap in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-coap-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "134e52442709306f9e09e5fc720cb6e38d11c2cd0a8b7bbe3dd6ae5a47691aa154e5d15003940193bc71d3e7c047b62e5c919f512be106087aea5f715bf8a42e"

RPROVIDES:${PN} += "qt6-coap-docs-html \
qt6-coap-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
