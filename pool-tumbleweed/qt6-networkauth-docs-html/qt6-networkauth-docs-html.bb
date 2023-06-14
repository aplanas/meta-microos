SUMMARY = "Documentation for qt6-networkauth in HTML format"
DESCRIPTION = "This package contains documentation for qt6-networkauth in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-networkauth-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "7aa5b34e0d01323f99d1124e5b97f2c555c52e30bea7fdc4eb0ac4bfbb7c1e482e42860827de5ae648a56138445b0c8a082f67e1af9505854d5d991b57da8cf3"

RPROVIDES:${PN} += "qt6-networkauth-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
