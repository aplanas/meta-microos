SUMMARY = "Metapackage to pull in all AWS X-Ray SDK backends"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package pulls in all available backends for python39-aws-xray-sdk as recommended packages."
LICENSE = "Apache-2.0"

PV = "2.12.0"

RPM_NAME = "python39-aws-xray-sdk-all-2.12.0-1.1.noarch.rpm"
RPM_HASH = "31b837ee845ab58805eaa0137dc4f4f28a13685bd6f51380a7fafb62230bed1b15b72231591162ca3eb3a10a3749abbf4fb12727e148fb0752352f10d4e5f210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-aws-xray-sdk-all"
RDEPENDS:${PN} += "python39-aws-xray-sdk"

inherit rpm
