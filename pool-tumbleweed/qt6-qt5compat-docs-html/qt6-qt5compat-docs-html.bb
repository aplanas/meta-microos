SUMMARY = "Documentation for qt6-qt5compat in HTML format"
DESCRIPTION = "This package contains documentation for qt6-qt5compat in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-qt5compat-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "47ae44f5a7071cd0aad168fa5e2a30b484203cee8e1f869f9790be75fcdd70d51e3af4069f09bfb8fe9eef8561b7656d36c203e83b7ac5aed9a46392254e622c"

RPROVIDES:${PN} += "qt6-qt5compat-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
