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

RPM_NAME = "python311-unearth-0.7.0-1.4.noarch.rpm"
RPM_HASH = "311107b47fb7600da43cd072e8a048b1c1d433bd969ac8358fa1937f96eeb0b15e4ed4df60073d92006c7def7ce9ad08c7c8d1f804792027b647e66fd84ee98a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(unearth) \
python311-unearth \
python3dist(unearth)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-packaging \
python311-requests \
update-alternatives"

inherit rpm
