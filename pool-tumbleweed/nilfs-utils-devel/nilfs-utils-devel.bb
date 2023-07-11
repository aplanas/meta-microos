SUMMARY = "Development package for the libnilfs library"
DESCRIPTION = "This package contains the development files for NILFS v2."
LICENSE = "GPL-2.0-only"

PV = "2.2.9"

RPM_NAME = "nilfs-utils-devel-2.2.9-1.5.aarch64.rpm"
RPM_HASH = "9791ed6d49780145a0cb4fcfc2b78399ef9e8e45c38ca1b648eb80dfc67d9515f29c1d76542efd0f94ac90f0c94b9d6dd5fe812c6ce6264563725e8c4b329351"

RPROVIDES:${PN} += "nilfs-utils-devel"

RDEPENDS:${PN} += "libnilfs0"

inherit rpm
