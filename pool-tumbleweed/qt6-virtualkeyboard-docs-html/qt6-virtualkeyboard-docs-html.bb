SUMMARY = "Documentation for qt6-virtualkeyboard in HTML format"
DESCRIPTION = "This package contains documentation for qt6-virtualkeyboard in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-virtualkeyboard-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "be742b83fdbd664ec0d02b48ebb99a306225f5607348e6553057d49b35d55051701c540dac0c407044ec3c179a5e2999031054a2e53ea189b59cd312258e14da"

RPROVIDES:${PN} += "qt6-virtualkeyboard-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
