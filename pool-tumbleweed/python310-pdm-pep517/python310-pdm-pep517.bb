SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python310-pdm-pep517-1.1.2-1.2.noarch.rpm"
RPM_HASH = "1f22dbf9196741f76ed8783263225b3f2a022b8975c5ac89c76a919fb87baa6d422ee0cc83ee6de8ae756ead8678811205acf05c6175a7f0eecaf5d7be3c8f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdm-pep517 \
python3.10dist(pdm-pep517) \
python310-pdm-pep517 \
python3dist(pdm-pep517)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
