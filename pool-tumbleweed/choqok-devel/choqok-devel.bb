SUMMARY = "Micro-Blogging Client for KDE"
DESCRIPTION = "A micro-blogging client for the K Desktop Environment. \
The name comes from an ancient Persian word which means Sparrow. \
It currently supports twitter.com and identi.ca services."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "choqok-devel-1.7.0-3.11.aarch64.rpm"
RPM_HASH = "af1f6960886d1bffa9f88a2364d810cf6f0225a928de3c6c2c6d68dfa6a7fbb176351bbe488a5f3b7ec1113c94f178cbd9ed925815e31c9aa52be0be9f4e5c46"

RPROVIDES:${PN} += "choqok-devel"

RDEPENDS:${PN} += "choqok"

inherit rpm
