SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.31.27"

RPM_NAME = "python310-botocore-1.31.27-1.1.noarch.rpm"
RPM_HASH = "32d7ff6a9bde274c213f8a6f7715112413a6440ec82cad341b523a3883989989a2cc09e886f45f1c69fc2f1bee17fe2edb6b633af6b83be6c3965c7ff3fe05c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-botocore \
python310-botocore \
python3dist-botocore"

RDEPENDS:${PN} += "-python310-jmespath >= 0.7.1 with python310-jmespath < 2.0.0 \
-python310-python-dateutil >= 2.1 with python310-python-dateutil < 3.0.0 \
python-abi \
python310-requests"

inherit rpm
