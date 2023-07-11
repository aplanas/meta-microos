SUMMARY = "CMSIS-DAP debugger for python"
DESCRIPTION = "On-chip debugger and flasher tool for ARM microcontrollers."
LICENSE = "Apache-2.0"

PV = "0.22.0"

RPM_NAME = "python310-pyOCD-0.22.0-2.15.noarch.rpm"
RPM_HASH = "cc11a77221ed033affe347d3063d997446767f24f88c0873c85d4474997bc1f4960ebb88499ed9acb8c2d3a677e6770e8d45bc96e68d9bc5360ad64a21c06cb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyocd \
python310-pyOCD \
python310-pyocd \
python3dist-pyocd"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-usb \
update-alternatives"

inherit rpm
