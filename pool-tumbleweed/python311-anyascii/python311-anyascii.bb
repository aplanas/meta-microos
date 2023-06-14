SUMMARY = "Unicode to ASCII transliteration"
DESCRIPTION = "Converts Unicode characters to their best ASCII representation."
LICENSE = "ISC"

PV = "0.3.2"

RPM_NAME = "python311-anyascii-0.3.2-1.1.noarch.rpm"
RPM_HASH = "62462de4666a84d256d9ab4c65d57aabf7e3bb5f644f1c147ab87ec522e9c4f4329a597d2569e64cdfba9582dcb87b1d884bad54d3fd863278110bcb4f6877cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-anyascii \
python311-anyascii \
python3dist-anyascii"

RDEPENDS:${PN} += "python-abi"

inherit rpm
