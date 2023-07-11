SUMMARY = "A tool to locate Python on the system"
DESCRIPTION = "A Python discovery tool to locate Python on the system."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python39-pythonfinder-1.3.1-3.6.noarch.rpm"
RPM_HASH = "fbd00ad2080f518a4b6faf38c5bba6ceb32b9af0b91c53ac7f911cd541175511e8f73131477e0db12381c0ac6884a6b6d7d8d253104d57b3194005a4b7a8e4e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pythonfinder \
python39-pythonfinder \
python3dist-pythonfinder"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-attrs \
python39-cached-property \
python39-click \
python39-packaging \
python39-vistir \
update-alternatives"

inherit rpm
