SUMMARY = "Documentation for qt6-lottie in HTML format"
DESCRIPTION = "This package contains documentation for qt6-lottie in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-lottie-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "7c26684c74cab79b258e29a87e477bc33eb76f1d3a8f964fbc2087e4d82bb651ab0a47b651bf73630aa0f98efd0fbcff1244a0a0ed9385f9382ace1c1fe6cc11"

RPROVIDES:${PN} += "qt6-lottie-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
