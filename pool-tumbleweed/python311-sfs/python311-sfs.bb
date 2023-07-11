SUMMARY = "Sound Field Synthesis toolbox for Python"
DESCRIPTION = "The Sound Field Synthesis Toolbox for Python gives you the \
possibility to create numercial simulations of sound field \
synthesis methods like wave field synthesis (WFS) or \
near-field compensated higher order Ambisonics (NFC-HOA)."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-sfs-0.6.2-1.3.noarch.rpm"
RPM_HASH = "9b231b6430e502f6d61c1966f168af7df00565d36cbb81bbf8b8145c497b5e5d467e6eb2bb25ea4e61a12fc7502b81c89d31d87cd60a493b10465e550f37e514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sfs \
python3.11dist-sfs \
python311-sfs \
python3dist-sfs"

RDEPENDS:${PN} += "python-abi \
python311-numpy \
python311-scipy"

inherit rpm
