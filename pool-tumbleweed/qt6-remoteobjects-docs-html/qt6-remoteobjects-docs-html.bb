SUMMARY = "Documentation for qt6-remoteobjects in HTML format"
DESCRIPTION = "This package contains documentation for qt6-remoteobjects in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "0e0f0fec31d02ce14e0c0afd794100c3a2e0255d545da9bcad1cfdf7c4cac3e300a96ea5dd4cf656b9b8270f32511231fc51ad243e89b691e249253bc2379ef1"

RPROVIDES:${PN} += "qt6-remoteobjects-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
