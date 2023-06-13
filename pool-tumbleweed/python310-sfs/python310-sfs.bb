SUMMARY = "Sound Field Synthesis toolbox for Python"
DESCRIPTION = "The Sound Field Synthesis Toolbox for Python gives you the \
possibility to create numercial simulations of sound field \
synthesis methods like wave field synthesis (WFS) or \
near-field compensated higher order Ambisonics (NFC-HOA)."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-sfs-0.6.2-1.1.noarch.rpm"
RPM_HASH = "ad9bea0c449f2adba22a2431ba14947c4e72221d32f6cbb68d5521cf7c84de14301e08d2c88a1e3e107428e558b4c02c5084c970f159a6a47814d5216cce98c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sfs \
python3.10dist(sfs) \
python310-sfs \
python3dist(sfs)"

RDEPENDS:${PN} += "python(abi) \
python310-numpy \
python310-scipy"

inherit rpm
