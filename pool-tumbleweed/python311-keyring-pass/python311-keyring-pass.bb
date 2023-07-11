SUMMARY = "Pass backend for python-keyring"
DESCRIPTION = "python-keyring backend getting data from pass."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python311-keyring-pass-0.7.1-1.5.noarch.rpm"
RPM_HASH = "1842572a13a08806360daadc578caf3c2f1b9cfcd096e08db98fe956e308b5a11afe484200aea73a853ac224c62dd16000d91b606d1ae6d36a60dbf7d833565f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keyring-pass \
python3.11dist-keyring-pass \
python311-keyring-pass \
python3dist-keyring-pass"

RDEPENDS:${PN} += "python-abi \
python311-jaraco.classes \
python311-keyring"

inherit rpm
