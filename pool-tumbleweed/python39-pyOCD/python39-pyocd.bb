SUMMARY = "CMSIS-DAP debugger for python"
DESCRIPTION = "On-chip debugger and flasher tool for ARM microcontrollers."
LICENSE = "Apache-2.0"

PV = "0.22.0"

RPM_NAME = "python39-pyOCD-0.22.0-2.13.noarch.rpm"
RPM_HASH = "12b6ee03ee961345382a905699b52a69fad62c121c0c8b3a6d734683e56385ed255ecd23019ed58146e0c7af6c6717b4a36b18acf33c0319daf197c511784b47"
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
