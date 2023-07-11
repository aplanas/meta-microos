SUMMARY = "Amazon Web Services Command Line Interface"
DESCRIPTION = "The AWS Command Line Interface (CLI) is a unified tool to manage AWS \
services. With this tool, multiple AWS services can be controlled \
from the command line and automated through scripts."
LICENSE = "Apache-2.0"

PV = "1.27.153"

RPM_NAME = "aws-cli-1.27.153-1.1.noarch.rpm"
RPM_HASH = "98f05215beb5b17ed343a6f8aae43b687a77cd45ad15e3432d2678655f304007a9281cd489a0e36b57d02932ed83c30ff5f942da40ed5cb33be5d93a03c1e141"
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
