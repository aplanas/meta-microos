SUMMARY = "Python module to handle type-length-value (TLV) encoded data"
DESCRIPTION = "Python module to handle type-length-value (TLV) encoded data 8-bit type, 8-bit length, and N-byte value as described within the Apple HomeKit Accessory Protocol Specification Non-Commercial Version Release R2."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python311-tlv8-0.10.0-1.1.noarch.rpm"
RPM_HASH = "c0c7364e29ac815747d518a7c1445f35097b404b88ae454460cb38293922de3a987b31ef5044c997206ffeaf2658f0177ac973a63d6eec25b8e1c271cc5da38d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tlv8 \
python3.11dist-tlv8 \
python311-tlv8 \
python3dist-tlv8"

RDEPENDS:${PN} += "python-abi"

inherit rpm
