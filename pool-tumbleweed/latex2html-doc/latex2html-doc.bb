SUMMARY = "Documentation for the Latex2HTML Converter"
DESCRIPTION = "This subpackage contains the documentation for the Latex2HTML converter."
LICENSE = "GPL-2.0-or-later & LPPL-1.3c"

PV = "2023.2"

RPM_NAME = "latex2html-doc-2023.2-1.1.noarch.rpm"
RPM_HASH = "81d952ccf781e079a0945b8be301d3625de7b729dcc71d1517aecb51c67b47fd1dc3a45f3cd93cdb5569403d5c76dd755f6f6b952c40e703354a512c327d299b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "latex2html-doc"

RDEPENDS:${PN} += ""

inherit rpm
