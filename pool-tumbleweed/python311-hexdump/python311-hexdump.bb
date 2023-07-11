SUMMARY = "Python tool to dump binary data"
DESCRIPTION = "This utility converts between the raw representation and a \
byte-based hexdump representation. \
 \
The display is equivalent to the output of the `hexdump -C` command, but \
it requires a Python runtime."
LICENSE = "Unlicense"

PV = "3.3"

RPM_NAME = "python311-hexdump-3.3-3.4.noarch.rpm"
RPM_HASH = "c108ec95d6cb1986f5c9ce4b4655ce2af2705d5d7b2b63ce0a88f13ea9453231d4fb50cd514ccab47457accc47ad9e572adc78a956bfdcdc8a2dd6f730d42fbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hexdump \
python3.11dist-hexdump \
python311-hexdump \
python3dist-hexdump"

RDEPENDS:${PN} += "python-abi"

inherit rpm
