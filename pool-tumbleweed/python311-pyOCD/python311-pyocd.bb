SUMMARY = "CMSIS-DAP debugger for python"
DESCRIPTION = "On-chip debugger and flasher tool for ARM microcontrollers."
LICENSE = "Apache-2.0"

PV = "0.22.0"

RPM_NAME = "python311-pyOCD-0.22.0-3.1.noarch.rpm"
RPM_HASH = "088e436358419152bfa3f8e3b1a3d5551c8233782a4d261838c320bf3b4436790cc8606a8653d24ddf025d02d023875d1680a2ba1ebb8aab19c1e1850d43985a"
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
