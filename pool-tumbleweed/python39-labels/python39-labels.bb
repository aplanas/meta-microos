SUMMARY = "CLI app for managing GitHub labels"
DESCRIPTION = "CLI app for managing GitHub labels."
LICENSE = "MIT"

PV = "20.1.0"

RPM_NAME = "python39-labels-20.1.0-1.4.noarch.rpm"
RPM_HASH = "9291c52d339af4f93a3887808b825b78b9e116cbe4a2af0d21cc95c82bba1b3c92bce37b266962637d452bcba00e7cbd04ecf7f2a0dbcb883a86ab890577c7d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-labels \
python39-labels \
python3dist-labels"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-attrs \
python39-click \
python39-pytoml \
python39-requests \
update-alternatives"

inherit rpm
