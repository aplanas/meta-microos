SUMMARY = "Documentation for qt6-charts in HTML format"
DESCRIPTION = "This package contains documentation for qt6-charts in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-charts-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "257ee148f91cafbf5098930eef633298cc7629892aa8e7b753ca2161db49e44eaeac022a40d3e0541abaaea4c4efab50bc634b69dfb9f17c298e64572567c62b"

RPROVIDES:${PN} += "qt6-charts-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
