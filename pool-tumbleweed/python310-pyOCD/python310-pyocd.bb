SUMMARY = "CMSIS-DAP debugger for python"
DESCRIPTION = "On-chip debugger and flasher tool for ARM microcontrollers."
LICENSE = "Apache-2.0"

PV = "0.22.0"

RPM_NAME = "python310-pyOCD-0.22.0-2.13.noarch.rpm"
RPM_HASH = "0f225f549569bd90d10ce872d561413de098fbd5159f484d68af2b95a3feaee1d42ee7fbfa93c9dffcffb024fa30162f611a475f4c124013f0a919e31e90f318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyOCD \
python3-pyocd \
python3.10dist-pyocd \
python310-pyOCD \
python310-pyocd \
python3dist-pyocd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-usb \
update-alternatives"

inherit rpm
