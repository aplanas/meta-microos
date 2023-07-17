SUMMARY = "Amazon Web Services Command Line Interface"
DESCRIPTION = "The AWS Command Line Interface (CLI) is a unified tool to manage AWS \
services. With this tool, multiple AWS services can be controlled \
from the command line and automated through scripts."
LICENSE = "Apache-2.0"

PV = "1.27.163"

RPM_NAME = "aws-cli-1.27.163-1.1.noarch.rpm"
RPM_HASH = "ecc8ddb819ff7c211f4f7d352f911431910bf51f2ff50d8a36bace9a347343c7f22b69925c4cff048418693e787bfc6b789444ddac5af469069469c476f001e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aws-cli \
awscli \
config-aws-cli \
python3.11dist-awscli \
python3dist-awscli"

RDEPENDS:${PN} += "/usr/bin/python3 \
groff \
python-abi \
python3 \
python3-PyYAML \
python3-botocore \
python3-colorama \
python3-docutils \
python3-rsa \
python3-s3transfer \
python3-six"

inherit rpm
