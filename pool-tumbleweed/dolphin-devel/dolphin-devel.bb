SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the libraries used by Dolphin and Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "dolphin-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "50480f1a89cba84b1283d535676758dd291d863986fcbc4d6c8bf9a9a6a0a1e1469f20a732eb9c5b5373cfd2cad70838e89eaa6765ad3827df68644a863f3249"

RPROVIDES:${PN} += "cmake-DolphinVcs \
dolphin-devel \
dolphin5-devel"

RDEPENDS:${PN} += "libdolphinvcs5"

inherit rpm
