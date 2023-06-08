SUMMARY = "Amazon Web Services Command Line Interface"
DESCRIPTION = "The AWS Command Line Interface (CLI) is a unified tool to manage AWS \
services. With this tool, multiple AWS services can be controlled \
from the command line and automated through scripts."
LICENSE = "Apache-2.0"

PV = "1.27.115"

RPM_NAME = "aws-cli-1.27.115-1.1.noarch.rpm"
RPM_HASH = "acc6721878bc97a6021beaf3f4a58e0db08c45ca21dbdb6a4cbd963c4ecf29c6c81295e1c4f01c6657fbf071e602b5bedd7ac1e5f1ca16bf0f7b89a8d6e317a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-cli awscli config(aws-cli) python3.10dist(awscli) python3dist(awscli)"
RDEPENDS:${PN} += "/usr/bin/python3 groff python(abi) python3 python3-PyYAML python3-botocore python3-colorama python3-docutils python3-rsa python3-s3transfer python3-six"

inherit rpm
