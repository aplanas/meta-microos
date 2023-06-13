SUMMARY = "Development files for dmraid"
DESCRIPTION = "This software discovers, activates, deactivates, and displays \
properties of software RAID sets, such as ATARAID, and contained DOS \
partitions. \
 \
dmraid uses libdevmapper and the device-mapper kernel runtime to create \
devices with respective mappings for the ATARAID sets discovered."
LICENSE = "GPL-2.0-only"

PV = "1.0.0.rc16.3"

RPM_NAME = "dmraid-devel-1.0.0.rc16.3-2.3.aarch64.rpm"
RPM_HASH = "1644c20fc248923d912eb137fb4514999659d859b5d9b35ae3faa161330a977d27b45e6b3c92633fe10460be6f02bc12e8ae9018b42a28ca955680e69ab8d0dd"

RPROVIDES:${PN} += "dmraid-devel \
dmraid-devel(aarch-64)"

RDEPENDS:${PN} += "dmraid"

inherit rpm
