SUMMARY = "Pure-python HTTP server"
DESCRIPTION = "Cheroot is the pure-Python HTTP server used by CherryPy."
LICENSE = "BSD-3-Clause"

PV = "9.0.0"

RPM_NAME = "python311-cheroot-9.0.0-3.1.noarch.rpm"
RPM_HASH = "d097a56df76275204acb1c45b9b7cc9404df8ca4a1a2bc07864cf7a8b42f7add68d3d06a98243c9e9ee51fda7096cb93132f91c26560ae482dbfb7b7fa0bae6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cheroot) \
python311-Cheroot \
python311-cheroot \
python3dist(cheroot)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python(abi) \
python311-jaraco.functools \
python311-more-itertools"

inherit rpm
