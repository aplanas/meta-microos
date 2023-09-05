SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.31.36"

RPM_NAME = "python39-botocore-1.31.36-1.1.noarch.rpm"
RPM_HASH = "052ea3bacee1e5dbc144127bcb69f659ee59cdd842a01923b33dfdca9cf5d7496a70b6c07a70e2b027ee759492ebaa9d6c96017db1fed7f5cf6eb342b1a93f85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-botocore \
python39-botocore \
python3dist-botocore"

RDEPENDS:${PN} += "-python39-jmespath >= 0.7.1 with python39-jmespath < 2.0.0 \
-python39-python-dateutil >= 2.1 with python39-python-dateutil < 3.0.0 \
python-abi \
python39-requests"

inherit rpm
