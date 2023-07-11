SUMMARY = "3D printer control software: python UI stack"
DESCRIPTION = "Cura is an engine for processing 3D models \
into 3D printing instruction for Ultimaker and other GCode based 3D printers. \
It is part of the larger open source project called 'Cura'. \
 \
Uranium is the Python framework for the Cura UI."
LICENSE = "AGPL-3.0-only"

PV = "3.6.21"

RPM_NAME = "uranium-lulzbot-3.6.21-2.4.aarch64.rpm"
RPM_HASH = "c891f55bc8cfa7b39864ddfa0fb335bae2f56071659a6941bca272f915d2b342b99aab3f8782665afa04996bfa0a0f0a060c4f6081ad6b9e7ff788bb475af790"

RPROVIDES:${PN} += "uranium-lulzbot"

RDEPENDS:${PN} += "python-abi"

inherit rpm
