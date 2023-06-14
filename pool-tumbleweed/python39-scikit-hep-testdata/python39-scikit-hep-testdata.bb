SUMMARY = "Example HEP files for testing and demonstrating"
DESCRIPTION = "A common package to provide example files (*e.g*. ROOT) for testing and \
developing packages against.  The sample of files is representative of typical \
files found 'in the wild'. \
 \
In addition to including some root files directly, this package adds some \
simple helper methods to get larger files from common open-access data \
repositories."
LICENSE = "BSD-3-Clause"

PV = "0.4.30"

RPM_NAME = "python39-scikit-hep-testdata-0.4.30-1.1.noarch.rpm"
RPM_HASH = "fc3eea492d88582e65872f7624e0c93ad47e4456e188d12e39d2f6ce9df489e5b822fbaf86a10824ab7fe9e2c3dc832df835a168729b8061edf9e773cff1acb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scikit-hep-testdata \
python39-scikit-hep-testdata \
python3dist-scikit-hep-testdata"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-PyYAML \
python39-requests \
scikit-hep-testdata-files \
update-alternatives"

inherit rpm
