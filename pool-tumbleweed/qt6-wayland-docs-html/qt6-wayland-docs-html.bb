SUMMARY = "Documentation for qt6-wayland in HTML format"
DESCRIPTION = "This package contains documentation for qt6-wayland in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-wayland-docs-html-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "765f5ef46148a4c530aeaa13d39a2e7d64ad2c5577af98b49e8e3e35265918234aa87d22600d5f0f1a3274b41a2781a883b1a6744b05f0a5c4ce91e7f3c533f4"

RPROVIDES:${PN} += "qt6-wayland-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
