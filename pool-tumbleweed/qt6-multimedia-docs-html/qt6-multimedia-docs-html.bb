SUMMARY = "Documentation for qt6-multimedia in HTML format"
DESCRIPTION = "This package contains documentation for qt6-multimedia in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-multimedia-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2116d9a3fc65c8ca1775e6832896d3b9140887f4511aeb533121a6606468136758662f341e0d3835ba4aeabf0f41fd57dd01b90dfadc6d05f3d916b5d1b6252f"

RPROVIDES:${PN} += "qt6-multimedia-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
