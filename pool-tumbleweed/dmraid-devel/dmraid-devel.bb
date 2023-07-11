SUMMARY = "Development files for dmraid"
DESCRIPTION = "This software discovers, activates, deactivates, and displays \
properties of software RAID sets, such as ATARAID, and contained DOS \
partitions. \
 \
dmraid uses libdevmapper and the device-mapper kernel runtime to create \
devices with respective mappings for the ATARAID sets discovered."
LICENSE = "GPL-2.0-only"

PV = "1.0.0.rc16.3"

RPM_NAME = "dmraid-devel-1.0.0.rc16.3-2.4.aarch64.rpm"
RPM_HASH = "ab3883bffd513ffc70d30f2cfba7c552ca6189222f832cec1f9a28a0e37a29e8eebd208434cd2028b9e8de4c0170fa9a36357179138897c871748baa665e5643"

RPROVIDES:${PN} += "dmraid-devel"

RDEPENDS:${PN} += "dmraid"

inherit rpm
