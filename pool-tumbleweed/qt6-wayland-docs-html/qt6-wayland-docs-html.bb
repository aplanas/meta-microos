SUMMARY = "Documentation for qt6-wayland in HTML format"
DESCRIPTION = "This package contains documentation for qt6-wayland in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-wayland-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ca601281efbdd9be03d076a03190f1581ce2724ef458f5098ed6ef499d6d8e1a0cf3f793faf9515ec68643c8f2a0a58fdbf6d1a964250a9e9adc24e23d1b25fd"

RPROVIDES:${PN} += "qt6-wayland-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
