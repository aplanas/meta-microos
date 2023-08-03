SUMMARY = "Documentation for qt6-coap in HTML format"
DESCRIPTION = "This package contains documentation for qt6-coap in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-coap-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "cdf34f3da382d157111df2bbc1c02e44e110cf736ed6797479a9b0d98dd238099d8b14d4a902946d7a8c2e780a272d7837648f4eae9f3b9d1e7a293a373502ff"

RPROVIDES:${PN} += "qt6-coap-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
