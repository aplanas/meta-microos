SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python39-pdm-pep517-1.1.2-2.3.noarch.rpm"
RPM_HASH = "5731b3bfa7a4de89e9e27f4afecac152dff5128efd27dd562c6fde85dd550e214458c2866835aad8719ff4fe19223c20db68c6b4c5e6098b9024967550abaa1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pdm-pep517 \
python39-pdm-pep517 \
python3dist-pdm-pep517"

RDEPENDS:${PN} += "python-abi"

inherit rpm
