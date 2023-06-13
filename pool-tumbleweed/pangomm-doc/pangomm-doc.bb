SUMMARY = "Developer documentation for pangomm, a C++ interface for Pango"
DESCRIPTION = "pangomm provides a C++ interface to the pango library. \
This package contains the developer documentation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.50.1"

RPM_NAME = "pangomm-doc-2.50.1-1.3.noarch.rpm"
RPM_HASH = "e50d99bb6d66d35dda1e0a9570e0bdb2ad0b3529210e966af3c8d253b459864c8c3d5795562320b330697c8dc1d0704ccc3daf8b19f36df4de9c4ec5ff3c4492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pangomm-doc"

RDEPENDS:${PN} += ""

inherit rpm
