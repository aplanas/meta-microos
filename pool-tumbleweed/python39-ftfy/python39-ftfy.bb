SUMMARY = "Python module for repairing mis-decoded Unicode text"
DESCRIPTION = "Ftfy attempts to repair Unicode text that has been erroneously \
put through an encode/decode cycle with different encodings."
LICENSE = "MIT"

PV = "6.0.3"

RPM_NAME = "python39-ftfy-6.0.3-1.9.noarch.rpm"
RPM_HASH = "b3575326caa038af7d877c378dc191a4b79d8b0de0cc1fa42f41ba22196a654e91751ee8edf2509dd459e1cde76955a18d8cd0de176ac7e4257f77f2cacb735a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ftfy \
python39-ftfy \
python3dist-ftfy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-wcwidth \
update-alternatives"

inherit rpm
