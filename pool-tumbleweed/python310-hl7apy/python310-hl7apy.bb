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

RPM_NAME = "python310-hl7apy-1.3.3-2.15.noarch.rpm"
RPM_HASH = "3100ea6297c0df94047b23356403fa46f05c796c24c2d4e94963da2b3d79b8db8014a62b5abeb9ea56a8695967ec4e9e51412277246ea79d61272b8076eb0160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hl7apy \
python310-hl7apy \
python3dist-hl7apy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
