SUMMARY = "Example HEP files for testing and demonstrating"
DESCRIPTION = "A common package to provide example files (*e.g*. ROOT) for testing and \
developing packages against.  The sample of files is representative of typical \
files found 'in the wild'. \
 \
In addition to including some root files directly, this package adds some \
simple helper methods to get larger files from common open-access data \
repositories."
LICENSE = "BSD-3-Clause"

PV = "0.4.31"

RPM_NAME = "python39-scikit-hep-testdata-0.4.31-1.1.noarch.rpm"
RPM_HASH = "a2d11211a9b438dcdd1f34ffac2201c30d33b5d041945aaeaebfb9b13ef850a1409b124c893ef1a641040f1465cb1f334de6e5879aec658346fe1cf50099b7c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-scikit-hep-testdata \
python39-scikit-hep-testdata \
python3dist-scikit-hep-testdata"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-requests \
scikit-hep-testdata-files \
update-alternatives"

inherit rpm
