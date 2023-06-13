SUMMARY = "Copic Colors for The Inkscape Palettes"
DESCRIPTION = "An original set of vector icons designed specifically for Elementary \
OS and its desktop environment, Pantheon. \
 \
This package contains a palette file for inkscape."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.0"

RPM_NAME = "elementary-icon-theme-inkscape-palette-5.1.0-1.10.noarch.rpm"
RPM_HASH = "3242c18ec7088ade37bc9a196509cbc91804b5a3ae2b43b1818c2dd2823727ed0d71bab8760e1862d375d421b70927e75d5b2e0bc46bc0e260e3740c0cfbbe10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elementary-icon-theme-inkscape-palette"

RDEPENDS:${PN} += "elementary-icon-theme \
inkscape"

inherit rpm
