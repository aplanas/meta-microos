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

RPM_NAME = "python310-scikit-hep-testdata-0.4.31-1.1.noarch.rpm"
RPM_HASH = "9c71f0857791b730fead957ab1839c1cc79fd8aa7687bfaa9d665eb74dd47cde4f495e39972dd41c0d3ef97b44dc24ec54bfdea813c08cb3a0c9ac2df574e7ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-scikit-hep-testdata \
python310-scikit-hep-testdata \
python3dist-scikit-hep-testdata"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-requests \
scikit-hep-testdata-files \
update-alternatives"

inherit rpm
