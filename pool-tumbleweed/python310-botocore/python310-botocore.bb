SUMMARY = "Python interface for AWS"
DESCRIPTION = "A low-level interface to a growing number of Amazon Web Services."
LICENSE = "Apache-2.0"

PV = "1.29.144"

RPM_NAME = "python310-botocore-1.29.144-1.1.noarch.rpm"
RPM_HASH = "2dabf94393f2951d29fbc42745c27458ab60fd71ebbabc8c50f2f9f7c4d40d9457922d135d73cb81693d8c015d5b0732bf42f8b9aa8db9f468a7b7fe8addc6f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-botocore \
python3.10dist(botocore) \
python310-botocore \
python3dist(botocore)"
RDEPENDS:${PN} += "(python310-jmespath >= 0.7.1 with python310-jmespath < 2.0.0) \
(python310-python-dateutil >= 2.1 with python310-python-dateutil < 3.0.0) \
python(abi) \
python310-requests"

inherit rpm
