SUMMARY = "Oxygen style, KWin decoration and cursors"
DESCRIPTION = "Provides Oxygen style, KWin decoration, and cursors."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "oxygen5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "8e4ff5ac49975a270b045aa107e03b4966cdc1ec1b35a064d9900b4d014c899cf4eb5879134c970de92e141f43e087448795a7d00497d65d3f16c6bd1b700efd"

RPROVIDES:${PN} += "oxygen5"

RDEPENDS:${PN} += "oxygen5-decoration \
oxygen5-style"

inherit rpm
