SUMMARY = "Python module for repairing mis-decoded Unicode text"
DESCRIPTION = "Ftfy attempts to repair Unicode text that has been erroneously \
put through an encode/decode cycle with different encodings."
LICENSE = "MIT"

PV = "6.0.3"

RPM_NAME = "python311-ftfy-6.0.3-1.9.noarch.rpm"
RPM_HASH = "0e114c9c32b31097bde6ece9ef1e8531ff40bc9b4c6b3e6693fe6110f5940b6cffea997bbac38349cc88614ef18b6b6832c115d9d3ffec2129db660070ff7081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ftfy \
python3.11dist-ftfy \
python311-ftfy \
python3dist-ftfy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-wcwidth \
update-alternatives"

inherit rpm
