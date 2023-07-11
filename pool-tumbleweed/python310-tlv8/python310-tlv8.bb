SUMMARY = "Python module to handle type-length-value (TLV) encoded data"
DESCRIPTION = "Python module to handle type-length-value (TLV) encoded data 8-bit type, 8-bit length, and N-byte value as described within the Apple HomeKit Accessory Protocol Specification Non-Commercial Version Release R2."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python310-tlv8-0.10.0-1.1.noarch.rpm"
RPM_HASH = "f4457a41054f9758fa5d68bd18cb5866e86256cdb5b891a34026db1555050931b6391ac035596084175f621dc151a468c127c1b33340c32b55c9e39357572840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tlv8 \
python310-tlv8 \
python3dist-tlv8"

RDEPENDS:${PN} += "python-abi"

inherit rpm
