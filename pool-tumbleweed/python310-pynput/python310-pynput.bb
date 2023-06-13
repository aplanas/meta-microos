SUMMARY = "Monitor and control user input devices"
DESCRIPTION = "Monitor and control user input devices"
LICENSE = "LGPL-3.0"

PV = "1.7.6"

RPM_NAME = "python310-pynput-1.7.6-1.1.noarch.rpm"
RPM_HASH = "32442624aecb4b9a0730f015fe7f67db433d9435552590b649cad593f6a4cfe6654c29c6dc3cdac057df8bc72605efbde2bf150ec642a71f4b599b118c3dee1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynput \
python3.10dist(pynput) \
python310-pynput \
python3dist(pynput)"

RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
