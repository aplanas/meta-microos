SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.29.144"

RPM_NAME = "python39-botocore-1.29.144-1.1.noarch.rpm"
RPM_HASH = "aa680daf3b2ada4d1e37b9df6a7df8d1d5a57fa45a326a64cfa057e429513fa71bb0b3b9c92a23461b5752aa78b03e3eb3219fa3ef5a9b156c75f7701cdc4616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(botocore) \
python39-botocore \
python3dist(botocore)"
RDEPENDS:${PN} += "(python39-jmespath >= 0.7.1 with python39-jmespath < 2.0.0) \
(python39-python-dateutil >= 2.1 with python39-python-dateutil < 3.0.0) \
python(abi) \
python39-requests"

inherit rpm
