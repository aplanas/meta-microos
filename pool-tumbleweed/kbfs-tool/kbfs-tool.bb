SUMMARY = "Keybase Filesystem command line utility"
DESCRIPTION = " \
A thin command line utility for interacting with the Keybase Filesystem \
without using a filesystem mountpoint."
LICENSE = "BSD-3-Clause"

PV = "6.2.2"

RPM_NAME = "kbfs-tool-6.2.2-2.1.aarch64.rpm"
RPM_HASH = "45eac7bfddf2ad21c40f3a5080bddf8ceff1681199dfb3feb30cd82eae1ad976aff3264995c5a0e8fdc52bb24490e14b522a39385b0bf8a0c6b31c1639ab0986"

RPROVIDES:${PN} += "kbfs-tool"

RDEPENDS:${PN} += "keybase-client"

inherit rpm
