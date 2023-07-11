SUMMARY = "Sphinx extension which renders display math in HTML via JavaScript"
DESCRIPTION = "sphinxcontrib-jsmath is a sphinx extension which renders display math in HTML \
via JavaScript."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "python39-sphinxcontrib-jsmath-1.0.1-4.2.noarch.rpm"
RPM_HASH = "6f2298876780f0bccd6dddc29160bb9934b2c033a5cce0a378a59bd02cccd79f8a49bae804d4d6872058ea1961ba991cba690e823278b0811ac578dec621321f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-jsmath \
python39-sphinxcontrib-jsmath \
python3dist-sphinxcontrib-jsmath"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
