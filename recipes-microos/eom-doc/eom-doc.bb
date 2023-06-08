SUMMARY = "Documentation how to Use eom"
DESCRIPTION = "This package contains the documentation for eom"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "eom-doc-1.26.0-1.10.noarch.rpm"
RPM_HASH = "0fb30037a6acbc87a356bee552390130476585a793e208b458ee87af23b30a6ee0a19d2c3e91eef3c62e8114328718cb58ca8219c55696d514b9e0b3c0c8a4ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eom-doc"
RDEPENDS:${PN} += ""

inherit rpm
