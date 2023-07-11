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

RPM_NAME = "python311-unearth-0.9.1-1.1.noarch.rpm"
RPM_HASH = "688245b216e80c3cf29d6ff7c2da221203f23a35211e5da08c6a2e94f069054c2e4edef670a97642392fab0f4913f3bac7c573fa1882ca8e97c552c4a1d6765b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unearth \
python3.11dist-unearth \
python311-unearth \
python3dist-unearth"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-packaging \
python311-requests \
update-alternatives"

inherit rpm
