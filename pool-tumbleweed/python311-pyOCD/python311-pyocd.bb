SUMMARY = "CMSIS-DAP debugger for python"
DESCRIPTION = "On-chip debugger and flasher tool for ARM microcontrollers."
LICENSE = "Apache-2.0"

PV = "0.22.0"

RPM_NAME = "python311-pyOCD-0.22.0-2.15.noarch.rpm"
RPM_HASH = "ebad543fca9a07d47e570f882923f186324c4bd8bc691e59264c180ac8b9fe6e97e7ddda2d33c514a234ec1105c58680fae92cf85d19696346dc377402fd07a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyOCD \
python3-pyocd \
python3.11dist-pyocd \
python311-pyOCD \
python311-pyocd \
python3dist-pyocd"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-usb \
update-alternatives"

inherit rpm
