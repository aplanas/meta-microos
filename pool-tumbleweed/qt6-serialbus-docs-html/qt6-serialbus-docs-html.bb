SUMMARY = "Documentation for qt6-serialbus in HTML format"
DESCRIPTION = "This package contains documentation for qt6-serialbus in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-serialbus-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "b6eb3c5a25f0e822d63a3baac8b3ba3b685d04343412034b45746d26a9424a6db13e046f0f344c067ffe65873253565cf3e9fd1c5be64c17f6839b77559f266a"

RPROVIDES:${PN} += "qt6-serialbus-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
