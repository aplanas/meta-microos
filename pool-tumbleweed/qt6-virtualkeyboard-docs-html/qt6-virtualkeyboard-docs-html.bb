SUMMARY = "Documentation for qt6-virtualkeyboard in HTML format"
DESCRIPTION = "This package contains documentation for qt6-virtualkeyboard in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "70655a71f733d7c158a7bfcc6734eb4accd31812d78ba9e6d8cdfef1dc9bdf5ca4c10389d7ee6e69b4982e41df412259ec5e1f74014ea831dce5f02da3d15b57"

RPROVIDES:${PN} += "qt6-virtualkeyboard-docs-html \
qt6-virtualkeyboard-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
