SUMMARY = "Sound Field Synthesis toolbox for Python"
DESCRIPTION = "The Sound Field Synthesis Toolbox for Python gives you the \
possibility to create numercial simulations of sound field \
synthesis methods like wave field synthesis (WFS) or \
near-field compensated higher order Ambisonics (NFC-HOA)."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python39-sfs-0.6.2-1.3.noarch.rpm"
RPM_HASH = "df7cc85f65caad884c1f447a709eb21a9a89031f8b74c615e829add1416afedadd56e8ba7febb821c62429ccbaf6f9164b6a7f2ea2b01187bf0b3a537ecaac12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sfs \
python39-sfs \
python3dist-sfs"

RDEPENDS:${PN} += "python-abi \
python39-numpy \
python39-scipy"

inherit rpm
