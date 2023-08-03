SUMMARY = "Documentation for qt6-connectivity in HTML format"
DESCRIPTION = "This package contains documentation for qt6-connectivity in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-connectivity-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "98ec660aaf4db503177c9af594f9cacfb41f68f4c7137bbe2f2bfcbba2b877d7af68c009c4e60b6b55b8fb10615a0795808cc286db941d9bd279be21db1eb2b1"

RPROVIDES:${PN} += "qt6-connectivity-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
