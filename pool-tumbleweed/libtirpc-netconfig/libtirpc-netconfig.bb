SUMMARY = "Netconfig configuration file for TI-RPC Library"
DESCRIPTION = "This RPM contains the netconfig configuration file and manual page for \
the TI-RPC Library."
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "libtirpc-netconfig-1.3.3-1.6.aarch64.rpm"
RPM_HASH = "aa83bf776df4c5a999cfa28dabfe7481dcd4d57580fde3e66033511c7c93888ffb1bf5223b86dc1bcf340f8852423d4cdf6faf86c1a2f38ab9092a7cf77d10ba"

RPROVIDES:${PN} += "config-libtirpc-netconfig \
libtirpc-netconfig"

RDEPENDS:${PN} += ""

inherit rpm
