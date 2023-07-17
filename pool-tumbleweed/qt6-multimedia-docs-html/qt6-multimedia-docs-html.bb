SUMMARY = "Documentation for qt6-multimedia in HTML format"
DESCRIPTION = "This package contains documentation for qt6-multimedia in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-multimedia-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "8969aee97022d848e1b10a1c59479f03153b0f3c15a754909c2b4306712c54377340082dc476badb844e0303845d907802456835edbc9313e0a84fe5dece4bce"

RPROVIDES:${PN} += "qt6-multimedia-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
