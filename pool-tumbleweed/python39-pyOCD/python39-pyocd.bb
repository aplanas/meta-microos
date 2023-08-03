SUMMARY = "CMSIS-DAP debugger for python"
DESCRIPTION = "On-chip debugger and flasher tool for ARM microcontrollers."
LICENSE = "Apache-2.0"

PV = "0.22.0"

RPM_NAME = "python39-pyOCD-0.22.0-3.1.noarch.rpm"
RPM_HASH = "517491c878e182f7dcabb2aaff8d8d31a2720de9eee819a78a63645383427284c15376a0e4d89f6e9c28f5d51e62365ba829fdb1203eca9f2502109c96c27f49"
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
