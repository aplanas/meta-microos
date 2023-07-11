SUMMARY = "Kismet BTLE geiger counter capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the BTLE geiger counter capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-bt-geiger-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "b75e520c3ce47a29c3f1ec06a87a253204ab7ecf15f47b1b55569e7316083aa9e5c93b2c396402065eec4303bd2735feab73262804d51f94f19ee3fd795f6053"

RPROVIDES:${PN} += "kismet-capture-bt-geiger \
python3.11dist-kismetcapturebtgeiger \
python3dist-kismetcapturebtgeiger"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
