SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-feather-2.1.0-1.2.noarch.rpm"
RPM_HASH = "0d6cd99c72c0b85c36d4616a970f15911c0cdd5546e59b1cbdd67f8f7e76399931d2fe96fc05adda973ed14dc8f18f7a6203344e3807e1d4c520e1c5b645e888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-feather \
python311-pandas-feather"

RDEPENDS:${PN} += "python311-pandas \
python311-pyarrow"

inherit rpm
