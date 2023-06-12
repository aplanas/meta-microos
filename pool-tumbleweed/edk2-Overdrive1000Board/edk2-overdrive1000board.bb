SUMMARY = "Firmware required to run the Overdrive1000Board"
DESCRIPTION = "Firmware required to run the Overdrive1000Board"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-Overdrive1000Board-0.0~20230118T162833~201514e6-2.1.aarch64.rpm"
RPM_HASH = "65b5c50aa088ebe92500c2320174fae6783e183462bead2f08f6c5c8e3e03194c6f0e8c28ce37436494ecb1a0ac34dcdf5054feef284bb06e1298ca21ec9fcde"

RPROVIDES:${PN} += "edk2-Overdrive1000Board \
edk2-Overdrive1000Board(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
