SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python311-pytest-jupyter-0.7.0-1.1.noarch.rpm"
RPM_HASH = "d05b89837184e7a1434b947ad6539fe0e50cf61bfaf44d751edfa3ea278d23a0707973929bac9e51d8ec1d70c9b47073d7eff31a587f7faab41995103ab31b11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-jupyter) \
python311-pytest-jupyter \
python3dist(pytest-jupyter)"

RDEPENDS:${PN} += "python(abi) \
python311-jupyter_core \
python311-pytest"

inherit rpm
