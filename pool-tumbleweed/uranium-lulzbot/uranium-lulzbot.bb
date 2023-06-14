SUMMARY = "3D printer control software: python UI stack"
DESCRIPTION = "Cura is an engine for processing 3D models \
into 3D printing instruction for Ultimaker and other GCode based 3D printers. \
It is part of the larger open source project called 'Cura'. \
 \
Uranium is the Python framework for the Cura UI."
LICENSE = "AGPL-3.0-only"

PV = "3.6.21"

RPM_NAME = "uranium-lulzbot-3.6.21-2.3.aarch64.rpm"
RPM_HASH = "0b0cbdd9d9554465dee9cf759d9854df584be8d08d9bff88effd69498ec261ab96314138f188d11bbc8a8e23e783fc9564af229e2f5f3454e91e5338c25129c9"

RPROVIDES:${PN} += "uranium-lulzbot"

RDEPENDS:${PN} += "python-abi"

inherit rpm
