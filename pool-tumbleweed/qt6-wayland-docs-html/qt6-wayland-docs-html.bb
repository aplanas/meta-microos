SUMMARY = "Documentation for qt6-wayland in HTML format"
DESCRIPTION = "This package contains documentation for qt6-wayland in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-docs-html-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "52cd69200e10465ff99bd369c00de2028d927fcdf36f542873fb47c96bcda324f2a9ef9c796b7ad75cafef39bbf6baba618087d787ebae8a02f64d0edea8e469"

RPROVIDES:${PN} += "qt6-wayland-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
