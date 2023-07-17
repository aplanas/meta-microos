SUMMARY = "Documentation for qt6-base in HTML format"
DESCRIPTION = "This package contains documentation for qt6-base in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-base-docs-html-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "335c09dc7a6242d65944ead5e08b709efa9e6e713f4b407bbd731225f29c12a5d9e958c7bc4a41c011a498bb9651e8e68cf6436d1b61765f3228e44792f8477a"

RPROVIDES:${PN} += "qt6-base-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
