SUMMARY = "CMSIS-DAP debugger for python"
DESCRIPTION = "On-chip debugger and flasher tool for ARM microcontrollers."
LICENSE = "Apache-2.0"

PV = "0.22.0"

RPM_NAME = "python39-pyOCD-0.22.0-2.15.noarch.rpm"
RPM_HASH = "c6a9b7974dff65ff4667a05bab42546fbe676ec5c53988d1d853f83ca1a1abbb9fb5df02277089b241624a0c30a2bc8f0fa381978e2279201277a4c0c2ded71d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyocd \
python39-pyOCD \
python39-pyocd \
python3dist-pyocd"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-usb \
update-alternatives"

inherit rpm
