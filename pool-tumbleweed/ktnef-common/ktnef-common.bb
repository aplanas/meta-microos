SUMMARY = "Files requires by libKPim5Tnef5"
DESCRIPTION = "Files that can't be in the libKPim5Tnef5 package anymore."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "ktnef-common-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "04c51a9a50eeb6d3d00d000c4471a7b91cb81555c17c5ceaaaba9f0c978d2cc433ce48c42c15f4561aa8bdc213f708ab774e9c5b4f4119d0d77ba2ef57c87fe0"

RPROVIDES:${PN} += "ktnef-common"

RDEPENDS:${PN} += ""

inherit rpm
