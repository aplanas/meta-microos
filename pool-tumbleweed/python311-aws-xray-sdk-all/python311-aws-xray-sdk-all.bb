SUMMARY = "Metapackage to pull in all AWS X-Ray SDK backends"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package pulls in all available backends for python311-aws-xray-sdk as recommended packages."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python311-aws-xray-sdk-all-2.12.0-2.3.noarch.rpm"
RPM_HASH = "fab41e38bcc0082866543623f9a8ba185b980fe784211f480935ac6b48b2b039eb69c199b7b3abd847b9e37af5f8d485efd3613807078d2a8cfaf12ae9231501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-all \
python311-aws-xray-sdk-all"

RDEPENDS:${PN} += "python311-aws-xray-sdk"

inherit rpm
