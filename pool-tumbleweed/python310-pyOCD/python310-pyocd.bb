SUMMARY = "CMSIS-DAP debugger for python"
DESCRIPTION = "On-chip debugger and flasher tool for ARM microcontrollers."
LICENSE = "Apache-2.0"

PV = "0.22.0"

RPM_NAME = "python310-pyOCD-0.22.0-3.1.noarch.rpm"
RPM_HASH = "15d7a34eca9e9a4770c050f80ef0d96beb4679b7161c74592fc81d872e03cd24607c36e47f975d8a9e647d081dd21a3b4886119bd0bf32253e63eb08a4b03d7a"
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
