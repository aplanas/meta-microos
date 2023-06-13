SUMMARY = "Python Left-Right Parser"
DESCRIPTION = "Python Left-Right Parser."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "python311-pyleri-1.3.3-1.8.noarch.rpm"
RPM_HASH = "65594f5331c315437e0f8d486f74f27f3efbf34cb2fc1fb00d4c929df9ab714566cfd8aeddc8b4bc60a526daf2fb24826e81f76f70060bbcc5e944e41c4c93d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyleri) \
python311-pyleri \
python3dist(pyleri)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
