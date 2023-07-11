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

RPM_NAME = "python39-hl7apy-1.3.3-2.15.noarch.rpm"
RPM_HASH = "357ab6111208980a83910dba38d2cacf14ed136e94dacb47ae0ede4ae083af3e19c5732420218c5f2d0d18ef9bdbb7bd9510c1624f13b16ff31bc06d0db88fb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hl7apy \
python39-hl7apy \
python3dist-hl7apy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
