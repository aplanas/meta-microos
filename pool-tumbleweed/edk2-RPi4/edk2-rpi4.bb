SUMMARY = "Firmware required to run the RPi4"
DESCRIPTION = "Firmware required to run the RPi4"
LICENSE = "SUSE-Firmware"

PV = "0.0~20230118T162833~201514e6"

RPM_NAME = "edk2-RPi4-0.0~20230118T162833~201514e6-3.1.aarch64.rpm"
RPM_HASH = "589035aad86dfece261a2780ae3657f66affef9861fd6f9f2d61f60d0249a834646e228ec7d0ceea5cd27bf6f00f75ada59d736d4708055e33c1a7d2f74d0918"

RPROVIDES:${PN} += "edk2-RPi4"

RDEPENDS:${PN} += ""

inherit rpm
