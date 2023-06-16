SUMMARY = "CMSIS-DAP debugger for python"
DESCRIPTION = "On-chip debugger and flasher tool for ARM microcontrollers."
LICENSE = "Apache-2.0"

PV = "0.22.0"

RPM_NAME = "python311-pyOCD-0.22.0-2.13.noarch.rpm"
RPM_HASH = "e317cf00fd6cf863482949ae97acfb7c11f58a3dd66831dbcdf5817a94bd96fdaff5191c7c80c9b54a6a01ae22aa69d7652ddfec15145edab576a6cb160149ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyocd \
python311-pyOCD \
python311-pyocd \
python3dist-pyocd"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-usb \
update-alternatives"

inherit rpm
