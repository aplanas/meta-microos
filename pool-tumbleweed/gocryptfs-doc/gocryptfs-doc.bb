SUMMARY = "Documentation for gocryptfs"
DESCRIPTION = "This package contains the documentation files for gocryptfs."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "gocryptfs-doc-2.4.0-1.1.noarch.rpm"
RPM_HASH = "a82eb4d4eab29d31d050287d4696f4b9eb3d89905cd3fdec3f51ce67369a964182b378edc1a8119e42b73c088e13b4b1dc369dc0d2c3637433c10e8077ba73b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gocryptfs-doc"

RDEPENDS:${PN} += ""

inherit rpm
