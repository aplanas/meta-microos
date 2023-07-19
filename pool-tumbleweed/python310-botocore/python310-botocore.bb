SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.31.2"

RPM_NAME = "python310-botocore-1.31.2-1.1.noarch.rpm"
RPM_HASH = "47dcbef696a75bf485a0783033388fe73b05e90cc40123d00d5ef3c97bbbee5d7ec3f23e1d63b833cad6f3dfa554fe6efd07a1d1476385b150c584b1706c3951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-botocore \
python310-botocore \
python3dist-botocore"

RDEPENDS:${PN} += "-python310-jmespath >= 0.7.1 with python310-jmespath < 2.0.0 \
-python310-python-dateutil >= 2.1 with python310-python-dateutil < 3.0.0 \
python-abi \
python310-requests"

inherit rpm
