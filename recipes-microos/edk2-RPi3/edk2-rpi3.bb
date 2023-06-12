SUMMARY = "Firmware required to run the RPi3"
DESCRIPTION = "Firmware required to run the RPi3"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-RPi3-0.0~20230118T162833~201514e6-2.1.aarch64.rpm"
RPM_HASH = "f1a629daea9e5f0f0e1dd3abccc56039a13e90a4877a201648b5c923cce6c29724211610508de7c20aac8b1d867f047ddadea4b38ae7d68dad6d3d71aa376568"

RPROVIDES:${PN} += "edk2-RPi3 \
edk2-RPi3(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
