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

RPM_NAME = "python310-unearth-0.9.1-1.1.noarch.rpm"
RPM_HASH = "3965eab72211e5d6f0daedeabc0bf5a384cbe14a39d2bea89c72c02371c92207017b70bac9ebd0d24e51b0713008264e15b2bfe9af30b513684cf72badcbbbc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-unearth \
python310-unearth \
python3dist-unearth"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-packaging \
python310-requests \
update-alternatives"

inherit rpm
