SUMMARY = "A utility to fetch and download python packages"
DESCRIPTION = "This project exists as the last piece to complete the puzzle of a package manager. The other pieces are: \
 \
- python-resolvelib - Resolves concrete dependencies from a set of (abstract) requirements. \
- python-unearth - Finds and downloads the best match(es) for a given requirement. \
- python-build - Builds wheels from the source code. \
- python-installer - Installs packages from wheels. \
 \
They provide all the low-level functionalities that are needed to resolve and install packages."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-unearth-0.7.0-1.4.noarch.rpm"
RPM_HASH = "300fedbe4f36a048dfef77fc8c0bf77852144d90413ffea5d80245c238f3fa8b62dcad95312ae606e05bab59daccc709139354d6c5c65b54052388d8e9928d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unearth \
python39-unearth \
python3dist-unearth"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-packaging \
python39-requests \
update-alternatives"

inherit rpm
