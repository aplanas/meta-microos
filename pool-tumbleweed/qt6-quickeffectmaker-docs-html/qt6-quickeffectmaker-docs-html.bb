SUMMARY = "Documentation for qt6-quickeffectmaker in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quickeffectmaker in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quickeffectmaker-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "245d74a252e2bf69f341e0969bb0e1161302c2d9b835e4d5fca69bec8e507da0a190660408d2496508ec391a71eb075cb7c445e2bb8bdc170ecb5d7c33bef7e1"

RPROVIDES:${PN} += "qt6-quickeffectmaker-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
