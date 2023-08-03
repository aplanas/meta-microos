SUMMARY = "Keybase Filesystem command line utility"
DESCRIPTION = " \
A thin command line utility for interacting with the Keybase Filesystem \
without using a filesystem mountpoint."
LICENSE = "BSD-3-Clause"

PV = "6.2.2"

RPM_NAME = "kbfs-tool-6.2.2-1.1.aarch64.rpm"
RPM_HASH = "3006186de38d795e0c4ed75007e35c1f9f8cb53d29f4e6aec041db52e72b76081cde82f526fa50af197a70fa31f26d71650f9dcfcf4c13b6d7bcac07012f91d1"

RPROVIDES:${PN} += "kbfs-tool"

RDEPENDS:${PN} += "keybase-client"

inherit rpm
