SUMMARY = "Keybase Filesystem command line utility"
DESCRIPTION = " \
A thin command line utility for interacting with the Keybase Filesystem \
without using a filesystem mountpoint."
LICENSE = "BSD-3-Clause"

PV = "6.0.2"

RPM_NAME = "kbfs-tool-6.0.2-3.4.aarch64.rpm"
RPM_HASH = "94aa1cba0f98f9533182620434568bf12bd4f6c396b6c2cd6cddc70ba111cdd7d36cc97431696fa75536612b07805278922015bd5fdd26e9847c1513aa327ec8"

RPROVIDES:${PN} += "kbfs-tool \
kbfs-tool(aarch-64)"

RDEPENDS:${PN} += "keybase-client"

inherit rpm
