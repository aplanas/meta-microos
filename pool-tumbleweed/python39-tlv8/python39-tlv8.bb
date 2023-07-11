SUMMARY = "Python module to handle type-length-value (TLV) encoded data"
DESCRIPTION = "Python module to handle type-length-value (TLV) encoded data 8-bit type, 8-bit length, and N-byte value as described within the Apple HomeKit Accessory Protocol Specification Non-Commercial Version Release R2."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python39-tlv8-0.10.0-1.1.noarch.rpm"
RPM_HASH = "044240770503b480888501c0d93fd3d4aba7bda338fd2857540b6963dab6c3ff3c115b73554391bd7c0cf8946b2076fcc2c5223885c6a27c75d420aee9b86a1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tlv8 \
python39-tlv8 \
python3dist-tlv8"

RDEPENDS:${PN} += "python-abi"

inherit rpm
