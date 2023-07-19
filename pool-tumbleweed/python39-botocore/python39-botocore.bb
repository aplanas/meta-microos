SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.31.2"

RPM_NAME = "python39-botocore-1.31.2-1.1.noarch.rpm"
RPM_HASH = "f42df7731a445c7f38bf6dfc5ff0d9493a1872be5f6f66af0437a23819c88efc6dd8648508188baaaeb838b1825f517c8632c6778815f4afdc154c21b1776b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-botocore \
python39-botocore \
python3dist-botocore"

RDEPENDS:${PN} += "-python39-jmespath >= 0.7.1 with python39-jmespath < 2.0.0 \
-python39-python-dateutil >= 2.1 with python39-python-dateutil < 3.0.0 \
python-abi \
python39-requests"

inherit rpm
