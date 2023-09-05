SUMMARY = "Development files for k3b"
DESCRIPTION = "This package contain files needed for development with k3b."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "k3b-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7868164b77bf338bd2575951114b514b46ba16bbed7c71f8a8d6e856d757af877a12a6502a211666ab39e46301afd4982db1444e1f478ba0e939af703a1040ab"

RPROVIDES:${PN} += "k3b-devel"

RDEPENDS:${PN} += "k3b"

inherit rpm
