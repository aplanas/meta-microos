SUMMARY = "CTypes based LibRaw bindings"
DESCRIPTION = "The rawkit (pronounced rocket) module is a ctypes-based LibRaw \
binding for Python inspired by the Wand API."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-rawkit-0.6.0-3.7.noarch.rpm"
RPM_HASH = "79dcfb9ac617f8d437c31d7da01b05f6456c0adfa7c288fa878b97bc9b98bf41466229a106dc780e14e6f171038c7054ab0ce40bfbcce5b65e74be1000fbac22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rawkit \
python310-rawkit \
python3dist-rawkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
