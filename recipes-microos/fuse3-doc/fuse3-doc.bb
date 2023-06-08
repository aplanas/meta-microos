SUMMARY = "Documentation for the FUSE library version 3"
DESCRIPTION = "This package contains the documentation for FUSE (userspace filesystem)."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.14.1"

RPM_NAME = "fuse3-doc-3.14.1-1.1.aarch64.rpm"
RPM_HASH = "3bf9303f6f7d185634c8a2b0a46716332e25d62f92e1756caf9d2df9644b8108aa6b8c5a7e61dd177df60b7ac403d735e615d56c4509972a3344d5101bf34a3d"

RPROVIDES:${PN} += "fuse3-doc fuse3-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
