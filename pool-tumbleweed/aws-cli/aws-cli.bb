SUMMARY = "Amazon Web Services Command Line Interface"
DESCRIPTION = "The AWS Command Line Interface (CLI) is a unified tool to manage AWS \
services. With this tool, multiple AWS services can be controlled \
from the command line and automated through scripts."
LICENSE = "Apache-2.0"

PV = "1.29.36"

RPM_NAME = "aws-cli-1.29.36-1.1.noarch.rpm"
RPM_HASH = "0a152ec2393140173bee6ffbc21556dc061e96fdbb8a27f37da6e0d6de539dad4663dcd33e808776691d7412aa36a523c45317ce640797168d8ca6f3bd6f5882"
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
