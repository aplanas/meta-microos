SUMMARY = "Sound Field Synthesis toolbox for Python"
DESCRIPTION = "The Sound Field Synthesis Toolbox for Python gives you the \
possibility to create numercial simulations of sound field \
synthesis methods like wave field synthesis (WFS) or \
near-field compensated higher order Ambisonics (NFC-HOA)."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-sfs-0.6.2-1.3.noarch.rpm"
RPM_HASH = "882b96b7e852ffeed4316be5d51027179720febc982ee128fb1029902011dd96bebf1790f466d72557f1b3f0925340d7c867296bc3a3e65728bc59eac5392c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sfs \
python310-sfs \
python3dist-sfs"

RDEPENDS:${PN} += "python-abi \
python310-numpy \
python310-scipy"

inherit rpm
