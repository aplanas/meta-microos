SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.31.27"

RPM_NAME = "python39-botocore-1.31.27-1.1.noarch.rpm"
RPM_HASH = "f1d08958f3a6323123784fc9c285226c6ca2d935f145afebb3b0c2d808a344dda819700b3e79635a27ea59411c0110ea65b787dda370325112588941968e2885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-botocore \
python39-botocore \
python3dist-botocore"

RDEPENDS:${PN} += "-python39-jmespath >= 0.7.1 with python39-jmespath < 2.0.0 \
-python39-python-dateutil >= 2.1 with python39-python-dateutil < 3.0.0 \
python-abi \
python39-requests"

inherit rpm
