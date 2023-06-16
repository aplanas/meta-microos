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

RPM_NAME = "python310-scikit-hep-testdata-0.4.30-1.1.noarch.rpm"
RPM_HASH = "2824c7c850ef96f32bc6274a6cf0b912a0d4d7830adf3a2ad0a47d43fa79453dc341996859200f5e27ebd615ea2cc16677717a6ef8cee721938fc5b414505dd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-hep-testdata \
python3.10dist-scikit-hep-testdata \
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
