SUMMARY = "Amazon Web Services Command Line Interface"
DESCRIPTION = "The AWS Command Line Interface (CLI) is a unified tool to manage AWS \
services. With this tool, multiple AWS services can be controlled \
from the command line and automated through scripts."
LICENSE = "Apache-2.0"

PV = "1.29.27"

RPM_NAME = "aws-cli-1.29.27-1.1.noarch.rpm"
RPM_HASH = "79cdaa2afabfbf2a334a10034770da7ecccf382c9ed1c3c1f344701fdf0e10c9adf50af69612a3242b133d158afac8d921de3d9a7a88858a9f60d08d6a570dc0"
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
