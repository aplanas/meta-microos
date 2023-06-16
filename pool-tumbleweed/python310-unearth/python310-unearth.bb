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

RPM_NAME = "python310-unearth-0.7.0-1.4.noarch.rpm"
RPM_HASH = "6e205b7911e83a8606b7da8cfdae936c84342db1ef2d8ccb4fd7b14270eb8477d5b444c15132509b3e42839496715c4b6fcc38e967226a2857172f9837233893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unearth \
python3.10dist-unearth \
python310-unearth \
python3dist-unearth"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-packaging \
python310-requests \
update-alternatives"

inherit rpm
