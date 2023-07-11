SUMMARY = "Sphinx directives versionremoved and removed-in"
DESCRIPTION = "Sphinx Removed In Extension"
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python39-sphinx-removed-in-0.2.1-2.5.noarch.rpm"
RPM_HASH = "6199a23db477712d4434c623da2724deacabc243d645dc3ce35acbe10e0155f3deb3b4b0769211bfe0f82b9f47760b72569e10daa87c4418d565294447af6bfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-removed-in \
python39-sphinx-removed-in \
python3dist-sphinx-removed-in"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
