SUMMARY = "Hu old hungarian rovas table for ibus-table"
DESCRIPTION = "ibus-table-rusle provides the Hu old hungarian rovas table for ibus-table."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.16"

RPM_NAME = "ibus-table-hu-old-hungarian-rovas-1.3.16-1.1.noarch.rpm"
RPM_HASH = "cb7f21dd66fc95752ed100726cbe9220c665c5b43c5c8d9565a612689c94643e8234ad51a0ab88f8f79a8a1b4aec30194b53be1a45ad34252794c56476db915a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-hu-old-hungarian-rovas"

RDEPENDS:${PN} += "ibus-table"

inherit rpm
