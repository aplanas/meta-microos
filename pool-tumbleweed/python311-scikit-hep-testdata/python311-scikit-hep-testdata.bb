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

RPM_NAME = "python311-scikit-hep-testdata-0.4.31-1.1.noarch.rpm"
RPM_HASH = "1ca7be76d7db24cd125bf9959c169a21ddb3c5d1e16517a6338434b28f9d7350644fba19d8d336f881437d4b95f72cb9f0a608edcbab3977c3fd7acd7d379dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-hep-testdata \
python3.11dist-scikit-hep-testdata \
python311-scikit-hep-testdata \
python3dist-scikit-hep-testdata"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-requests \
scikit-hep-testdata-files \
update-alternatives"

inherit rpm
