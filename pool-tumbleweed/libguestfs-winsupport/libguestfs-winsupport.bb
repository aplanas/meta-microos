SUMMARY = "Windows guest support in libguestfs"
DESCRIPTION = "Provides the needed pieces for libguestfs to handle Windows guests."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-winsupport-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "3728459ad24d74822d35aef6a1c8a87978889b50c871f0ce5de75bf3ebcc7bf27b0961e3b6fa1722670c40f367cd76bcfa4c45b86798b93ecf395a0e0494d3aa"

RPROVIDES:${PN} += "guestfs-winsupport \
libguestfs-winsupport"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
