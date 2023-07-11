SUMMARY = "Sphinx extension to generate a matrix of pluggable drivers"
DESCRIPTION = "An extension to Sphinx to generate a matrix of pluggable drivers and \
their support to an API."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "python39-sphinx-feature-classification-1.1.0-3.1.noarch.rpm"
RPM_HASH = "7d905ee415d016dfa28a6f9937f5516aba0879c39a0c62f8d06e0db2accc6176bec64aab84161457a6d8191c1cfc3658e3d6cfe2af248517d70febdf38de99c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-feature-classification \
python39-sphinx-feature-classification \
python3dist-sphinx-feature-classification"

RDEPENDS:${PN} += "python-abi \
python39-docutils \
python39-pbr"

inherit rpm
