SUMMARY = "Documentation for the libodfgen API"
DESCRIPTION = "This package contains documentation for the libodfgen API."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.1.8"

RPM_NAME = "libodfgen-devel-doc-0.1.8-3.9.noarch.rpm"
RPM_HASH = "4a0e1504a2e7437f6b5d8f8b4185fb5394a0770e80c2c1a68a8c4e2f63e1b32948f93bb10e330b2bfd7401f22798f2b2ee460e55f555ea82089e5f1e498b161e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libodfgen-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
