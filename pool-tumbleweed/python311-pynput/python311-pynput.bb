SUMMARY = "Monitor and control user input devices"
DESCRIPTION = "Monitor and control user input devices"
LICENSE = "LGPL-3.0-only"

PV = "1.7.6"

RPM_NAME = "python311-pynput-1.7.6-3.1.noarch.rpm"
RPM_HASH = "641cbaed96b28a17202fd32b1f4c8bb253570e86d59dd72bdd3926d1757b0f0afeabc24ffb6363ce5e9efc849f1d7fe1f88c91aaada71cf0a29b64ae34921c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pynput \
python3.11dist-pynput \
python311-pynput \
python3dist-pynput"

RDEPENDS:${PN} += "python-abi \
python311-evdev \
python311-six"

inherit rpm
