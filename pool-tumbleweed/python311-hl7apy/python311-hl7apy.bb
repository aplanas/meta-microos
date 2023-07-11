SUMMARY = "A Python library to parse, create and handle HL7 v2x messages"
DESCRIPTION = "HL7apy is a Python package to handle HL7 <http://www.hl7.org> v2 \
messages according to HL7 specifications. \
 \
The main features include: \
 * Message parsing \
 * Message creation \
 * Message validation following the HL7 xsd specifications \
 * Access to elements by name, long name or position \
 * Support to all simple and complex datatypes \
 * Encoding chars customization \
 * Message encoding in ER7 format and compliant with MLLP protocol"
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "python311-hl7apy-1.3.3-2.15.noarch.rpm"
RPM_HASH = "2b8d518c708e43464d3aea6aae633ea89f2fcc879518d1cb970a2305f923c0c7717b028a0e02f9f4dce31628b19c5fa6e92af35f5f1746725ae017297b5c9758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hl7apy \
python3.11dist-hl7apy \
python311-hl7apy \
python3dist-hl7apy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
