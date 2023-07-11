SUMMARY = "Documentation for gupnp"
DESCRIPTION = "Documentation for GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.4"

RPM_NAME = "gupnp-doc-1.6.4-1.1.noarch.rpm"
RPM_HASH = "5d0f6b533333a9c39932754cb3ba56c8e9241170ac207f1f666fa031551c6a91df36ee44fa4e83cad9b8f3a9d8ee2468a99811ba4b43ae928fb5eb0ad37ca8b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gupnp-doc"

RDEPENDS:${PN} += ""

inherit rpm
