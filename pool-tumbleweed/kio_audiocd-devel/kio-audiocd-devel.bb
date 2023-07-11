SUMMARY = "Development package for kio_audiocd"
DESCRIPTION = "This package contains the development files for the audiocd kio slave"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kio_audiocd-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e62d5882541192d5165d3cd3ea0aa3e8f33c5460dda21635a2b747e86b4b2242e3a3621925d06dc5ffa392cb0ed8ceaeb54f892a5834f431b9bd43b0ef7ecc99"

RPROVIDES:${PN} += "kio-audiocd-devel"

RDEPENDS:${PN} += "kio-audiocd"

inherit rpm
