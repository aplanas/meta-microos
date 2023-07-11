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

PV = "0.9.1"

RPM_NAME = "python39-unearth-0.9.1-1.1.noarch.rpm"
RPM_HASH = "5f2278b2247932df6b02d1c10f6311f673a539f4bd2bd21cf4d8ed548b439963d9d8971f5fd5ac3441be9e285f7111a3bb423efcc340c00478cae4b93755bc16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unearth \
python39-unearth \
python3dist-unearth"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-packaging \
python39-requests \
update-alternatives"

inherit rpm
