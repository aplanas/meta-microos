SUMMARY = "Documentation for qt6-speech in HTML format"
DESCRIPTION = "This package contains documentation for qt6-speech in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-speech-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "9447717aee2e278cd1cca6774c53a190378b32f6629044e03dfaf3559b5dbd694172aaec2eac82c3c047cd394fb698eaf595ffeb0a232a650cf2d148887c61b5"

RPROVIDES:${PN} += "qt6-speech-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
