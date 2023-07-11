SUMMARY = "Development files for the slop library"
DESCRIPTION = "Header files for the slop library."
LICENSE = "GPL-3.0-or-later"

PV = "7.6"

RPM_NAME = "slop-devel-7.6-2.7.aarch64.rpm"
RPM_HASH = "62e179ef84b49604b4fe8b03a0dd7a7219511431dba7f476a2d4fe16fa202e5099aa0a8f06da76e171d689a629ebbdd57a3a01c3630bd0f6d854f558f320b009"

RPROVIDES:${PN} += "slop-devel"

RDEPENDS:${PN} += "libslopy7-6"

inherit rpm
