SUMMARY = "Documentation for qt6-quick3dphysics in HTML format"
DESCRIPTION = "This package contains documentation for qt6-quick3dphysics in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dphysics-docs-html-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b75a3a1770b24f1d74f8438084c4a258736aa78d8f255814fc02a285dc88ae8578bac395def50b7426babf2c86ce71012b565ce5c5bcb55df2855ec10c2643f2"

RPROVIDES:${PN} += "qt6-quick3dphysics-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
