SUMMARY = "Documentation for qt6-lottie in HTML format"
DESCRIPTION = "This package contains documentation for qt6-lottie in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-lottie-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "446368f26f6b2cc6ed69057c4a6e23faf826f72225e5c135aa7d38fa7dc0515f3b36e9715e3c873aa72fd1f2e82d60434c01c707aacdf9aa8aaef9c5494dc9d5"

RPROVIDES:${PN} += "qt6-lottie-docs-html \
qt6-lottie-docs-html(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
